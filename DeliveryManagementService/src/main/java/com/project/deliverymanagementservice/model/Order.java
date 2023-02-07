package com.project.deliverymanagementservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private int orderId;
	private int userId;
	private double totalAmount;
	private int productId;
	private String productName;
	
}
