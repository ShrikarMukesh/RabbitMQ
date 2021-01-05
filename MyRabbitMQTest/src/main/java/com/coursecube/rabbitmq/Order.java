package com.coursecube.rabbitmq;
import java.io.Serializable; 

public class Order implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	int OrderId; 
	String OrderDate; 
	int custId; 
	int totalQty; 
	double totalCost; 
	String status;

	//Constrcutors 


	public Order(int orderId, String orderDate, int custId, int totalQty, double totalCost, String status) {
		super();
		OrderId = orderId;
		OrderDate = orderDate;
		this.custId = custId;
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.status = status;
	}
	//Setters and Getters 

	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 

	//toString() 
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", OrderDate=" + OrderDate + ", custId=" + custId + ", totalQty="
				+ totalQty + ", totalCost=" + totalCost + ", status=" + status + "]";
	}


}