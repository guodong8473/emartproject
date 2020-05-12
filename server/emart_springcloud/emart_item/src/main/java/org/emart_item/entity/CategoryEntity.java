package org.emart_item.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class CategoryEntity {

  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "category_name")
  private String category_name;

  @Column(name = "brief_details")
  private String brief_details;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCategory_name() {
	return category_name;
}

public void setCategory_name(String category_name) {
	this.category_name = category_name;
}

public String getBrief_details() {
	return brief_details;
}

public void setBrief_details(String brief_details) {
	this.brief_details = brief_details;
}

}
