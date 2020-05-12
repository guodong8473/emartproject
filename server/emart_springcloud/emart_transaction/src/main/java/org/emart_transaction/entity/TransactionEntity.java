package org.emart_transaction.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class TransactionEntity {

  @Id
  @Column(name = "id")
  private int id;

//  @Column(name = "buyer_id")
//  private int buyer_id;
// 
//  @Column(name = "seller_id")
//  private int seller_id;
 
  @Column(name = "transaction_type")
  private String transaction_type;

  @Column(name = "date_time")
  private String date_time;

  @Column(name = "remarks")
  private String remarks;

  @Column(name = "create_time")
  private Timestamp create_time;

  @Column(name = "update_time")
  private Timestamp update_time;

  @OneToOne  
  @JoinColumn(name = "buyer_id", referencedColumnName = "id")  
  private BuyerEntity buyer;
  
  
  @OneToOne  
  @JoinColumn(name = "seller_id", referencedColumnName = "id")  
  private SellerEntity seller;
  
	public SellerEntity getBuyer() {
		return seller;
	}
	
	public void setBuyer(BuyerEntity buyer) {
		this.buyer = buyer;
	}
	
	public SellerEntity getSeller() {
		return seller;
	}

	public void setSeller(SellerEntity seller) {
		this.seller = seller;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
//	public int getBuyer_id() {
//		return buyer_id;
//	}
//	
//	public void setBuyer_id(int buyer_id) {
//		this.buyer_id = buyer_id;
//	}
//	
//	public int getSeller_id() {
//		return seller_id;
//	}
//	
//	public void setSeller_id(int seller_id) {
//		this.seller_id = seller_id;
//	}
//	
	public String getTransaction_type() {
		return transaction_type;
	}
	
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
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
