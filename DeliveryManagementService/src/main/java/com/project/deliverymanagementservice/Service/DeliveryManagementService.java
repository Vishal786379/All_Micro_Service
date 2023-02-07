package com.project.deliverymanagementservice.Service;

import com.project.deliverymanagementservice.model.DeliveryManagement;
import com.project.deliverymanagementservice.model.Order;
import com.project.deliverymanagementservice.model.TransactionRequest;


public interface DeliveryManagementService {

	public DeliveryManagement bookDelivery(TransactionRequest deliverymanagement);
}
