package com.project.Ordermanagement.model;

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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class OrderManagement {
	
	@Id
//	@GeneratedValue
	private int orderId;
	private int userId;
	private double totalAmount;
	private int productId;
	private String productName;
	

}
