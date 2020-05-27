package org.emart_purchasehistory.service;

import java.util.List;

import org.emart_purchasehistory.entity.PurchasehistoryEntity;
import org.emart_purchasehistory.model.PurchasehistoryModel;
import org.emart_purchasehistory.repository.PurchasehistoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchasehistoryService {
	
	@Autowired
	PurchasehistoryRepository purchasehistoryRepository;

	
    public List<PurchasehistoryEntity> getPurchasehistory() {
    	return (List<PurchasehistoryEntity>) purchasehistoryRepository.findAll();
    	//return (List<PurchasehistoryEntity>) purchasehistoryRepository.getHistory();
    }
	
    public void insertPurchasehistory(PurchasehistoryModel purchasehistoryModel) {
    	PurchasehistoryEntity purchasehistoryEntity = new PurchasehistoryEntity();
    	BeanUtils.copyProperties(purchasehistoryModel, purchasehistoryEntity);	
    //	purchasehistoryRepository.save(purchasehistoryEntity);
    }
}
