package org.emart_transaction.model;

import org.emart_transaction.entity.TransactionEntity;

import lombok.Data;

@Data
public class TransactionModel extends TransactionEntity {

  private int buyer_id;
 
  private int seller_id;

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

}
