package org.emart_item.service;

import java.util.List;

import org.emart_item.entity.ItemEntity;
import org.emart_item.model.ItemModel;
import org.emart_item.repository.ItemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;

	
    public List<ItemEntity> getItem() {
    	return (List<ItemEntity>) itemRepository.findAll();
    }
	
    public void insertItem(ItemModel itemModel) {
    	ItemEntity itemEntity = new ItemEntity();
    	BeanUtils.copyProperties(itemModel, itemEntity);	
    	itemRepository.save(itemEntity);
    }
}
