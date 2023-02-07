package com.project.Ordermanagement.service;

import java.util.List;

import com.project.Ordermanagement.model.OrderManagement;
import com.project.Ordermanagement.model.TransactionRequest;

public interface OrderManagementService {

	public OrderManagement saveOrder(TransactionRequest orderManagement);

	public List<OrderManagement> getAllOrders();

}
