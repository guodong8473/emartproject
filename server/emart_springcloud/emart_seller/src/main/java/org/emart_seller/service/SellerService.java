package org.emart_seller.service;

import java.util.List;

import org.emart_seller.entity.SellerEntity;
import org.emart_seller.model.SellerModel;
import org.emart_seller.repository.SellerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
	
	@Autowired
	SellerRepository sellerRepository;

	
    public List<SellerEntity> getSeller() {
    	return (List<SellerEntity>) sellerRepository.findAll();
    }
	
    public void insertSeller(SellerModel sellerModel) {
    	SellerEntity sellerEntity = new SellerEntity();
    	BeanUtils.copyProperties(sellerModel, sellerEntity);	
    	sellerRepository.save(sellerEntity);
    }
}
