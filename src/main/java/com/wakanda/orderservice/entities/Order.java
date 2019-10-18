package com.wakanda.orderservice.entities;

public class Order {

	public int orderId;

	public String customerName;

	public double orderTotal;

	public Order() {

	}

	public Order(int orderid, String customer, double total) {
		this.orderId = orderid;
		this.customerName = customer;
		this.orderTotal = total;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

}
