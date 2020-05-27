package org.emart_item.service;

import java.util.List;

import org.emart_item.entity.ItemEntity;
import org.emart_item.model.ItemModel;
import org.emart_item.model.ItemSearchModel;
import org.emart_item.repository.ItemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;

	
    public List<ItemEntity> getItems(ItemSearchModel itemSearchModel) {
//    	return (List<ItemEntity>) itemRepository.findAll();
    	int start_price = Integer.parseInt(itemSearchModel.getStart_price());
    	int end_price = Integer.parseInt(itemSearchModel.getEnd_price());
    	String manufactory = itemSearchModel.getManufactory();
    	String name = itemSearchModel.getName();
    	
    	
    	return (List<ItemEntity>) itemRepository.getItems(start_price, end_price, name, manufactory);
    }
    
    public List<ItemEntity> getAllItems() {
    	return (List<ItemEntity>) itemRepository.findAll();
    }    
    
    public void updatestock(ItemModel itemModel) {

    	ItemEntity itemEntity = itemRepository.getByid(itemModel.getId());		
    	itemEntity.setStock_number(itemModel.getStock_number());
    	itemRepository.save(itemEntity);
    }
    
    public void insertItem(ItemModel itemModel) {
    	ItemEntity itemEntity = new ItemEntity();
    	BeanUtils.copyProperties(itemModel, itemEntity);	
    	itemRepository.save(itemEntity);
    }
}
