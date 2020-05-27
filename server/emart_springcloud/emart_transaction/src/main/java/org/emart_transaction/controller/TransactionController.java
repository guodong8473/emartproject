package org.emart_transaction.controller;


import java.util.List;

import org.emart_transaction.entity.TransactionEntity;
import org.emart_transaction.model.TransactionModel;
import org.emart_transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="/trans",method=RequestMethod.GET)
	public List<TransactionEntity> getTransactionInfo(){
		System.out.println("transaction");
		return transactionService.getTransaction();
//		return ResponseEntity.ok(buyerService.getBuyer());
	}

    @RequestMapping(value = "/deltrans", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> deltrans(@RequestBody String id){
		System.out.println("register");
		transactionService.delTransaction(id);
		return ResponseEntity.ok(1);
//		return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	//@PostMapping(value="/register")
	public ResponseEntity<Integer> register(@RequestBody TransactionModel transactionModel){
		System.out.println("register");
		transactionService.insertTransaction(transactionModel);
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
