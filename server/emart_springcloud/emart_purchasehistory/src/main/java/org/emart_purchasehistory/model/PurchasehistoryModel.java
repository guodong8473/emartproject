package org.emart_purchasehistory.model;

import javax.persistence.Entity;

import org.emart_purchasehistory.entity.PurchasehistoryEntity;

import lombok.Data;

@Data
public class PurchasehistoryModel extends PurchasehistoryEntity {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
