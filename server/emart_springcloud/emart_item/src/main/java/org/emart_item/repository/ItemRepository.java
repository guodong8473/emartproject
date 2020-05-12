package org.emart_item.repository;

import org.emart_item.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity,String> {}