package javaresttest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaresttest.springboot.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
