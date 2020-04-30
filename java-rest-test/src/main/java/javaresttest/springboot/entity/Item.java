package javaresttest.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_desc")
	private String itemDesc;
	
	@Column(name = "amount")
	private String amount;
	
	public Item() {	//default constructor
		
	}
	
	public Item(String itemName, String itemdesc, String amount) {	
		super();
		this.itemName = itemName;
		this.itemDesc = itemdesc;
		this.amount = amount;
	}
	
	public long getId() {	//general getters and setters
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getitemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
