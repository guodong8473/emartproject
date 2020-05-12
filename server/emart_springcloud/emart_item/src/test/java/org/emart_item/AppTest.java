package org.emart_item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.emart_item.entity.ItemEntity;
import org.junit.jupiter.api.Test;


public class AppTest {

	   @Test public void getPerson(){	   
		   EntityManagerFactory factory=Persistence.createEntityManagerFactory("emartHibernate");
		   EntityManager em=factory.createEntityManager();
		   ItemEntity item=em.find(ItemEntity.class,1);
		  // em.refresh(person);//若直接更改了数据库中的数据，应该用refresh刷新一下数据库的动态变化，保证输出正确结果
		   System.out.println(item);	   
		   em.close();
		   factory.close();	   	   
	   }

}
