package org.emart_discount.controller;


import java.util.List;

import org.emart_discount.entity.DiscountEntity;
import org.emart_discount.model.DiscountModel;
import org.emart_discount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DiscountController {

	@Autowired
	private DiscountService discountService;
	
	@RequestMapping(value="/discount",method=RequestMethod.GET)
	public List<DiscountEntity> getPurchasehistoryInfo(){
		System.out.println("transaction");
		return discountService.getDiscount();
//		return ResponseEntity.ok(buyerService.getBuyer());
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> register(@RequestBody DiscountModel discountModel){
		System.out.println("register");
		discountService.insertDiscount(discountModel);
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
