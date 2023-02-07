package com.project.cartservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCatlog {
	private int productId;
	private String productName;
	private int quantity;
	private double price;
}
