package org.emart_purchasehistory.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="purchasehistory")
public class PurchasehistoryEntity {

  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "buyer_id")
  private int buyer_id;
 
  @Column(name = "seller_id")
  private int seller_id;
 
  @Column(name = "transaction_id")
  private int transaction_id;
  
//  @Column(name = "item_id")
//  private int item_id;
  
  @OneToOne  
  @JoinColumn(name = "item_id", referencedColumnName = "id")  
  private ItemEntity item;
  
  
  
  
  public ItemEntity getItem() {
	return item;
}

public void setItem(ItemEntity item) {
	this.item = item;
}

@Column(name = "number_of_items")
  private int number_of_items;
  
  @Column(name = "date_time")
  private String date_time;

  @Column(name = "remarks")
  private String remarks;

//  @Column(name = "create_time")
//  private Timestamp create_time;
//
//  @Column(name = "updateTime")
//  private Timestamp updateTime;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getBuyer_id() {
	return buyer_id;
}

public void setBuyer_id(int buyer_id) {
	this.buyer_id = buyer_id;
}

public int getSeller_id() {
	return seller_id;
}

public void setSeller_id(int seller_id) {
	this.seller_id = seller_id;
}

public int getTransaction_id() {
	return transaction_id;
}

public void setTransaction_id(int transaction_id) {
	this.transaction_id = transaction_id;
}

//public int getItem_id() {
//	return item_id;
//}
//
//public void setItem_id(int item_id) {
//	this.item_id = item_id;
//}

public int getNumber_of_items() {
	return number_of_items;
}

public void setNumber_of_items(int number_of_items) {
	this.number_of_items = number_of_items;
}

public String getDate_time() {
	return date_time;
}

public void setDate_time(String date_time) {
	this.date_time = date_time;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}



}
