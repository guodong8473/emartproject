package org.emart_purchasehistory.repository;

import java.util.List;

import org.emart_purchasehistory.entity.PurchasehistoryEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PurchasehistoryRepository extends CrudRepository<PurchasehistoryEntity,String> {
	
	
	@Query(value = "select p.*, i.price from purchasehistory p, item i where p.item_id=i.id",nativeQuery = true)
	public List<PurchasehistoryEntity> getHistory();
}