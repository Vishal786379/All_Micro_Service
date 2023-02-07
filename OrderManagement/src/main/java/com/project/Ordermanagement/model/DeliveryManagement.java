package com.project.Ordermanagement.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryManagement {
//	private String deliveryId;
	private int orderId;
	private int userId;
	private double totalAmount;
	private int productId;
	private String productName;
	
}
