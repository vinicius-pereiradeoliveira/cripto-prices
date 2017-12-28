package com.api.prices.crypto.cryptoprices.entity;

public class ValueAlert {
	
	boolean status;
	String id;
	double price;
	
	public ValueAlert() {
	}
	
	public ValueAlert(boolean status, String id, double price) {
		this.status = status;
		this.id = id;
		this.price = price;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ValueAlert [status=" + status + ", id=" + id + ", price=" + price + "]";
	}
}
