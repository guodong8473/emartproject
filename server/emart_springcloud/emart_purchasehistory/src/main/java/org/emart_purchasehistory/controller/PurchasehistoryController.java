package org.emart_purchasehistory.controller;


import java.util.List;

import org.emart_purchasehistory.entity.PurchasehistoryEntity;
import org.emart_purchasehistory.model.PurchasehistoryModel;
import org.emart_purchasehistory.service.PurchasehistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PurchasehistoryController {

	@Autowired
	private PurchasehistoryService purchasehistoryService;
	
	@RequestMapping(value="/history",method=RequestMethod.GET)
	public List<PurchasehistoryEntity> getPurchasehistoryInfo(){
		System.out.println("purchasehistory");
		return purchasehistoryService.getPurchasehistory();
//		return ResponseEntity.ok(buyerService.getBuyer());
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> register(@RequestBody PurchasehistoryModel purchasehistoryModel){
		System.out.println("register");
		purchasehistoryService.insertPurchasehistory(purchasehistoryModel);
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
