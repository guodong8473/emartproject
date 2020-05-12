package org.emart_item.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class ItemEntity {

  @Id
  @Column(name = "id")
  private int id;

  @ManyToOne  
  @JoinColumn(name = "category_id", referencedColumnName = "id")  
  private CategoryEntity category;
//  @Column(name = "category_id")
//  private int category_id;
 
  
  @ManyToOne  
  @JoinColumn(name = "subcategory_id", referencedColumnName = "id")  
  private CategoryEntity subcategory;
//  @Column(name = "subcategory_id")
//  private int subcategory_id;
 
  @Column(name = "price")
  private String price;

  @Column(name = "item_name")
  private String item_name;

  @Column(name = "description")
  private String description;
  
  @Column(name = "gstin")
  private String gstin;
  
  @Column(name = "stock_number")
  private int stock_number;
  
  
  @Column(name = "remarks")
  private String remarks;

  @Column(name = "create_time")
  private Timestamp create_time;

  @Column(name = "updateTime")
  private Timestamp updateTime;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

//public int getCategory_id() {
//	return category_id;
//}
//
//public void setCategory_id(int category_id) {
//	this.category_id = category_id;
//}

//public int getSubcategory_id() {
//	return subcategory_id;
//}
//
//public void setSubcategory_id(int subcategory_id) {
//	this.subcategory_id = subcategory_id;
//}

public CategoryEntity getCategory() {
	return category;
}

public void setCategory(CategoryEntity category) {
	this.category = category;
}

public CategoryEntity getSubcategory() {
	return subcategory;
}

public void setSubcategory(CategoryEntity subcategory) {
	this.subcategory = subcategory;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getItem_name() {
	return item_name;
}

public void setItem_name(String item_name) {
	this.item_name = item_name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getGstin() {
	return gstin;
}

public void setGstin(String gstin) {
	this.gstin = gstin;
}

public int getStock_number() {
	return stock_number;
}

public void setStock_number(int stock_number) {
	this.stock_number = stock_number;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}

public Timestamp getCreate_time() {
	return create_time;
}

public void setCreate_time(Timestamp create_time) {
	this.create_time = create_time;
}

public Timestamp getUpdateTime() {
	return updateTime;
}

public void setUpdateTime(Timestamp updateTime) {
	this.updateTime = updateTime;
}


}
