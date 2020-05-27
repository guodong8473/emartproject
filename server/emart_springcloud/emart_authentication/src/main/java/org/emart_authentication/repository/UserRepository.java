package org.emart_authentication.repository;

import javax.transaction.Transactional;

import org.emart_authentication.entity.BuyerEntity;
import org.emart_authentication.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BuyerEntity, Integer>{
	
	public UserEntity findById(Integer id);

	@Transactional
	@Query(value = "select * from buyer where user_name=?",nativeQuery = true)
	public BuyerEntity findUserByUserName(String user_name);
	
	@Modifying
	@Transactional
	@Query(value = "update s_user u set u.conformed='1' where u.id=?",nativeQuery = true)
	public int activeUser(@Param("id")Integer id);
}
