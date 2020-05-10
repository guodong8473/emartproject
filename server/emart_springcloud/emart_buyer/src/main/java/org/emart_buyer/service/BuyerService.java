package org.emart_buyer.service;

import java.util.List;

import org.emart_buyer.entity.BuyerEntity;
import org.emart_buyer.model.BuyerModel;
import org.emart_buyer.repository.BuyerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {
	
	@Autowired
	BuyerRepository buyerRepository;

	
    public List<BuyerEntity> getBuyer() {
    	return (List<BuyerEntity>) buyerRepository.findAll();
    }
	
    public void insertBuyer(BuyerModel buyModel) {
    	BuyerEntity buyerEntity = new BuyerEntity();
    	BeanUtils.copyProperties(buyModel, buyerEntity);	
    	buyerRepository.save(buyerEntity);
    }
}
