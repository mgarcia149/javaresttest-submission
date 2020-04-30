package javaresttest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaresttest.springboot.entity.Item;
import javaresttest.springboot.exception.ResourceNotFoundException;
import javaresttest.springboot.repository.ItemRepository;

@RestController
@RequestMapping("/api/item")
public class ItemsController {

	@Autowired
	private ItemRepository itemRepository;

	//getting all the items
	@GetMapping
	public List<Item> getAllItems() {
		return this.itemRepository.findAll();
	}

	//getting an item by id
	@GetMapping("/{id}")
	public Item getItemById(@PathVariable (value = "id") long itemId) {
		return this.itemRepository.findById(itemId).orElseThrow(() -> new ResourceNotFoundException("Item was not found with this id :" + itemId));
	}

	//creating an item
	@PostMapping
	public Item createNewItem(@RequestBody Item item) {
		return this.itemRepository.save(item);
	}
	
	//updating an item
	@PutMapping("/{id}")
	public Item updateItem(@RequestBody Item item, @PathVariable ("id") long itemId) {
		 Item existingItem = this.itemRepository.findById(itemId).orElseThrow(() -> new ResourceNotFoundException("Item was not found with this id :" + itemId));
		 
		 existingItem.setItemName(item.getItemName());
		 existingItem.setItemDesc(item.getitemDesc());
		 existingItem.setAmount(item.getAmount());
		 return this.itemRepository.save(existingItem);
	}
	
	//deleting an item by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Item> deleteItem(@PathVariable ("id") long itemId){
		 Item existingItem = this.itemRepository.findById(itemId).orElseThrow(() -> new ResourceNotFoundException("Item was not found with this id :" + itemId));
		 
		 this.itemRepository.delete(existingItem);
		 return ResponseEntity.ok().build();
	}
}
