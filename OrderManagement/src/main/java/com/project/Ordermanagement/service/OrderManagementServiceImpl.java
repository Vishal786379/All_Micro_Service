package com.project.Ordermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.Ordermanagement.dao.OrderManagementRepository;
import com.project.Ordermanagement.model.DeliveryManagement;
import com.project.Ordermanagement.model.OrderManagement;
import com.project.Ordermanagement.model.Payment;
import com.project.Ordermanagement.model.TransactionRequest;

@Service
public class OrderManagementServiceImpl implements OrderManagementService {

	@Autowired
	OrderManagementRepository omRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OrderManagement saveOrder(TransactionRequest request) {
		Payment payment = request.getPayment();
		OrderManagement orderManagement = request.getOrderManagement();
		DeliveryManagement deliveryManagement = request.getDeliveryManagement();
//		omRepo.save(orderManagement);
		
		payment.setOrderId(orderManagement.getOrderId());
		payment.setUserId(orderManagement.getUserId());
		payment.setTotalAmount(orderManagement.getTotalAmount());
		
		deliveryManagement.setOrderId(orderManagement.getOrderId());
		deliveryManagement.setUserId(orderManagement.getUserId());
		deliveryManagement.setProductId(orderManagement.getProductId());
		deliveryManagement.setProductName(orderManagement.getProductName());
		deliveryManagement.setTotalAmount(orderManagement.getTotalAmount());
		
		
		restTemplate.postForObject("http://localhost:8085/payment/dopayment", payment, Payment.class);
		restTemplate.postForObject("http://localhost:8089/delivery/bookDelivery", deliveryManagement, DeliveryManagement.class);
		return omRepo.save(orderManagement);
	}

	@Override
	public List<OrderManagement> getAllOrders() {
		
		return omRepo.findAll();
	}

}
