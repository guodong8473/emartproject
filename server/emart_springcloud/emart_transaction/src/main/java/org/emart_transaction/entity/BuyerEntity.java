package org.emart_transaction.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class BuyerEntity {

  @Id
  @Column(name = "id")
  private int id;
  
  @Column(name = "user_name")
  private String user_name;

  @Column(name = "password")
  private String password;

  @Column(name = "email")
  private String email;

  @Column(name = "mobile_number")
  private String mobile_number;

  @Column(name = "create_time")
  private Timestamp create_time;

  @Column(name = "update_time")
  private Timestamp update_time;

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

public Timestamp getCreate_time() {
	return create_time;
}

public void setCreate_time(Timestamp create_time) {
	this.create_time = create_time;
}

public Timestamp getUpdate_time() {
	return update_time;
}

public void setUpdate_time(Timestamp update_time) {
	this.update_time = update_time;
}

}
