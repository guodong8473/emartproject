package org.emart_item.controller;


import java.util.List;

import org.emart_item.entity.ItemEntity;
import org.emart_item.model.ItemModel;
import org.emart_item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/item",method=RequestMethod.GET)
	public List<ItemEntity> getItemInfo(){
		System.out.println("getItems");
		return itemService.getItem();
//		return ResponseEntity.ok(buyerService.getBuyer());
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> register(@RequestBody ItemModel itemModel){
		System.out.println("register");
		itemService.insertItem(itemModel);
		return ResponseEntity.ok(1);
//		return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
	}
	
//	@RequestMapping(value="/hello", method=RequestMethod.GET)
//	public String hello() {
//		return userService.getMessage();
//	}

	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public String delete() {
		return "Delete user successfully";
	}
}
