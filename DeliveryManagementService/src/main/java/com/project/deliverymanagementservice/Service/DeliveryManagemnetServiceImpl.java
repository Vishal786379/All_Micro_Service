package com.project.deliverymanagementservice.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.deliverymanagementservice.Repository.DeliveryManagementRepository;
import com.project.deliverymanagementservice.model.Account;
import com.project.deliverymanagementservice.model.DeliveryManagement;
import com.project.deliverymanagementservice.model.Order;
import com.project.deliverymanagementservice.model.Payment;
import com.project.deliverymanagementservice.model.TransactionRequest;

@Service
public class DeliveryManagemnetServiceImpl implements DeliveryManagementService{

	@Autowired
	private DeliveryManagementRepository deliverymanagementrepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public DeliveryManagement bookDelivery(TransactionRequest request) {
		// TODO Auto-generated method stub
		Account account = request.getAccount();
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		DeliveryManagement deliverymanagement = request.getDeliveryManagement();
	
//		restTemplate.postForObject("http://localhost:8085/payment/doPayment", payment, Payment.class);	
		return deliverymanagementrepository.save(deliverymanagement);
//		return null;
	}
}
