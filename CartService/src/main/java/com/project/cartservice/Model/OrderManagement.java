package com.project.cartservice.Model;

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
public class OrderManagement {
	private int orderId;
	private int userId;
	private double totalAmount;
	private int productId;
	private String productName;
}
