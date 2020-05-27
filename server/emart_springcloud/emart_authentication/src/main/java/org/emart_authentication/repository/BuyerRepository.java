package org.emart_authentication.repository;

import javax.transaction.Transactional;

import org.emart_authentication.entity.BuyerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BuyerRepository extends CrudRepository<BuyerEntity,String> {
	
	
	@Query(value = "select * from buyer where user_name=?",nativeQuery = true)
	public BuyerEntity findUserByUserName(String user_name);
}