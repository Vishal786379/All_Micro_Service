package com.project.deliverymanagementservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	private int orderId;
	private double totalAmount;
	private int userId;
	private int transactionId;
}
