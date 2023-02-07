package com.project.searchservice.model;

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
	private Account account;
	private Cart cart;
	private Search search;
	private ProductCatlog productcatlog;
}
