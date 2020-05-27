package org.emart_item.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.emart_item.entity.ItemEntity;
import org.junit.Test;

public class ItemServiceTest {

	@Test
	public void testGetItem() throws ClassNotFoundException, SQLException {
		   EntityManagerFactory factory=Persistence.createEntityManagerFactory("emartHibernate");
		   System.out.println ("数据库连接成功！");
		   
		   
//		   EntityManager em=factory.createEntityManager();
//		   ItemEntity item=em.find(ItemEntity.class,1);
//		  // em.refresh(person);//若直接更改了数据库中的数据，应该用refresh刷新一下数据库的动态变化，保证输出正确结果
//		   System.out.println(item);	   
//		   em.close();
//		   factory.close();	   	 	
		   
/*		   Class.forName("com.mysql.cj.jdbc.Driver");  
           System.out.println ("数据库驱动加载成功！");  
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emart?serverTimezone=UTC&useUnicode=true&amp;characterEncoding=UTF-8&amp;generateSimpleParameterMetadata=true","root","asdf");  
           System.out.println ("数据库连接成功！");  */
	
	}

}
