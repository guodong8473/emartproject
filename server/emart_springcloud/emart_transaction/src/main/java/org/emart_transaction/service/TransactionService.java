package org.emart_transaction.service;

import java.util.List;

import org.emart_transaction.entity.BuyerEntity;
import org.emart_transaction.entity.SellerEntity;
import org.emart_transaction.entity.TransactionEntity;
import org.emart_transaction.model.TransactionModel;
import org.emart_transaction.repository.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository transactionRepository;

	
    public List<TransactionEntity> getTransaction() {
    	return (List<TransactionEntity>) transactionRepository.findAll();
    }
	
    public void insertTransaction(TransactionModel transactionModel) {
    	TransactionEntity transactionEntity = new TransactionEntity();
    	BeanUtils.copyProperties(transactionModel, transactionEntity);
    	
    	BuyerEntity buyer = new BuyerEntity();
    	buyer.setId(transactionModel.getBuyer_id());
    	transactionEntity.setBuyer(buyer);
    	
    	SellerEntity seller = new SellerEntity();
    	seller.setId(transactionModel.getSeller_id());
    	transactionEntity.setSeller(seller);	
    	
    	
    	transactionRepository.save(transactionEntity);
    }
}
