package org.emart_buyer.controller;


import java.util.List;

import org.emart_buyer.entity.BuyerEntity;
import org.emart_buyer.model.BuyerModel;
import org.emart_buyer.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BuyerController {

	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping(value="/buyer",method=RequestMethod.GET)
	public List<BuyerEntity> getBuyerInfo(){
		System.out.println("getBuyers");
		return buyerService.getBuyer();
//		return ResponseEntity.ok(buyerService.getBuyer());
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> register(@RequestBody BuyerModel buyerModel){
		System.out.println("register");
		buyerService.insertBuyer(buyerModel);
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
