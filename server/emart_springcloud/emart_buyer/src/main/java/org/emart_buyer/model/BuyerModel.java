package org.emart_buyer.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BuyerModel {


  private int id;
  
  private String user_name;

  private String password;

  private String email;

  private String mobile_number;

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile_number() {
	return mobile_number;
}

public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}

}
