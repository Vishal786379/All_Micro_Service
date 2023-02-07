package com.project.Ordermanagement.model;

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
public class TransactionRequest {
//		private Cart cart;
		private OrderManagement orderManagement;
		private Payment payment;
		private DeliveryManagement deliveryManagement;
}
