package org.emart_item.model;

import org.emart_item.entity.ItemEntity;

import lombok.Data;

@Data
public class ItemModel extends ItemEntity {
	
	private String start_price;
	private String end_price;
	private String manufactory;
	private String name;
	
	
	
	public String getStart_price() {
		return start_price;
	}
	public void setStart_price(String start_price) {
		this.start_price = start_price;
	}
	public String getEnd_price() {
		return end_price;
	}
	public void setEnd_price(String end_price) {
		this.end_price = end_price;
	}
	public String getManufactory() {
		return manufactory;
	}
	public void setManufactory(String manufactory) {
		this.manufactory = manufactory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

}
