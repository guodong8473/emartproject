package org.emart_discount.service;

import java.util.List;

import org.emart_discount.entity.DiscountEntity;
import org.emart_discount.model.DiscountModel;
import org.emart_discount.repository.DiscountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
	
	@Autowired
	DiscountRepository discountRepository;

	
    public List<DiscountEntity> getDiscount() {
    	return (List<DiscountEntity>) discountRepository.findAll();
    }
	
    public void insertDiscount(DiscountModel discountModel) {
    	DiscountEntity discountEntity = new DiscountEntity();
    	BeanUtils.copyProperties(discountModel, discountEntity);	
    	discountRepository.save(discountEntity);
    }
}
