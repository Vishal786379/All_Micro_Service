package com.project.deliverymanagementservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryManagement {
	@Id
//	@GeneratedValue
	private String deliveryId;
	private int userId;
	private double totalAmount;
	private int productId;
	private String productName;
}
