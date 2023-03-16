package com.ty;

import java.util.List;

public class Amozon {
	private int orderid;
	private int quantity;
	private int cost;

	private List<String> item;
	@Override
	public String toString() {
		return "Amozon [orderid=" + orderid + ", quantity=" + quantity + ", cost=" + cost + "]";
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public List<String> getItem() {
		return item;
	}
	public void setItem(List<String> item) {
		this.item = item;
	}


}
