package org.emart_item.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.emart_item.entity.ItemEntity;
import org.junit.jupiter.api.Test;

class ItemServiceTest {

	@Test
	void testGetItem() {
		   EntityManagerFactory factory=Persistence.createEntityManagerFactory("emartHibernate");
		   EntityManager em=factory.createEntityManager();
		   ItemEntity item=em.find(ItemEntity.class,1);
		   System.out.println(item);	   
		   em.close();
		   factory.close();	   	 
	}

}
