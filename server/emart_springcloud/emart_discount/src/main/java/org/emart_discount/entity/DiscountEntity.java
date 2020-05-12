package org.emart_discount.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="discount")
public class DiscountEntity {

  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "discount_code")
  private String discount_code;

  @Column(name = "percentage")
  private Float percentage;

  @Column(name = "start_date")
  private String start_date;

  @Column(name = "end_date")
  private String end_date;

  @Column(name = "description")
  private String description;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDiscount_code() {
	return discount_code;
}

public void setDiscount_code(String discount_code) {
	this.discount_code = discount_code;
}

public Float getPercentage() {
	return percentage;
}

public void setPercentage(Float percentage) {
	this.percentage = percentage;
}

public String getStart_date() {
	return start_date;
}

public void setStart_date(String start_date) {
	this.start_date = start_date;
}

public String getEnd_date() {
	return end_date;
}

public void setEnd_date(String end_date) {
	this.end_date = end_date;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
 
}
