package org.emart_item.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class SubcategoryEntity {

  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "category_id")
  private int category_id;

  @Column(name = "subcategory_name")
  private String subcategory_name;

  @Column(name = "brief_details")
  private String brief_details;
  
  @Column(name = "gst")
  private String gst;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCategory_id() {
	return category_id;
}

public void setCategory_id(int category_id) {
	this.category_id = category_id;
}

public String getSubcategory_name() {
	return subcategory_name;
}

public void setSubcategory_name(String subcategory_name) {
	this.subcategory_name = subcategory_name;
}

public String getBrief_details() {
	return brief_details;
}

public void setBrief_details(String brief_details) {
	this.brief_details = brief_details;
}

public String getGst() {
	return gst;
}

public void setGst(String gst) {
	this.gst = gst;
}

}
