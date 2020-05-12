package org.emart_seller.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class SellerEntity {

  @Id
  @Column(name = "id")
  private int id;
  
  @Column(name = "user_name")
  private String user_name;

  @Column(name = "password")
  private String password;

  @Column(name = "company_name")
  private String company_name;
  
  @Column(name = "gstin")
  private String gstin;
  
  @Column(name = "company_brief")
  private String company_brief;
  
  
  @Column(name = "postal_address")
  private String postal_address;
  
  
  @Column(name = "website")
  private String website;
  
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "contact_number")
  private String contact_number;
 
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

public String getUser_name() {
	return user_name;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCompany_name() {
	return company_name;
}

public void setCompany_name(String company_name) {
	this.company_name = company_name;
}

public String getGstin() {
	return gstin;
}

public void setGstin(String gstin) {
	this.gstin = gstin;
}

public String getCompany_brief() {
	return company_brief;
}

public void setCompany_brief(String company_brief) {
	this.company_brief = company_brief;
}

public String getPostal_address() {
	return postal_address;
}

public void setPostal_address(String postal_address) {
	this.postal_address = postal_address;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getContact_number() {
	return contact_number;
}

public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
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
