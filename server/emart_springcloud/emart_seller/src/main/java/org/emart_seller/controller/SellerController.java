package org.emart_seller.controller;


import java.util.List;

import org.emart_seller.entity.SellerEntity;
import org.emart_seller.model.SellerModel;
import org.emart_seller.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(value="/seller",method=RequestMethod.GET)
	public List<SellerEntity> getSellerInfo(){
		System.out.println("getSellers");
		return sellerService.getSeller();
//		return ResponseEntity.ok(buyerService.getBuyer());
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> register(@RequestBody SellerModel sellerModel){
		System.out.println("register");
		sellerService.insertSeller(sellerModel);
		return ResponseEntity.ok(200);
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
