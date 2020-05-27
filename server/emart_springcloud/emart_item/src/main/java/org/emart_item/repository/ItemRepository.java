package org.emart_item.repository;

import java.util.List;

import org.emart_item.entity.ItemEntity;
import org.emart_item.model.ItemSearchModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity,String> {
	
	
	@Query(value = "select * from item where price >= ?1 and price <= ?2 and item_name like CONCAT('%',?3,'%') and gstin like CONCAT('%',?4,'%')"
//			+ "where price = ?1"
//			+ "where CONVERT(price, decimal(10,5))>=CONVERT(?1, decimal(10,5)) "
//			+ "and price<=?2 "
//			+ "and item_name like %?3%"
//			+ "and (item_name like CONCAT('%',?3,'%')  or ?1 is null) "
//			+ "and (item_name like CONCAT('%',?3,'%')) "
			,nativeQuery = true)
	public List<ItemEntity> getItems(int start_price, int end_price,String name, String manufactory);
	
	
	@Query(value = "select * from item where id=?"	,nativeQuery = true)
	public ItemEntity getByid(int id);

}