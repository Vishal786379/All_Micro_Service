package com.project.deliverymanagementservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.deliverymanagementservice.Service.DeliveryManagementService;
import com.project.deliverymanagementservice.model.DeliveryManagement;
import com.project.deliverymanagementservice.model.TransactionRequest;

@RestController
@RequestMapping("/delivery")
public class DeliveryManagementController {
	@Autowired
	private DeliveryManagementService deliveryManagementService;

	@PostMapping("/bookDelivery")
	public DeliveryManagement bookDelivery(@RequestBody TransactionRequest request) {
		return deliveryManagementService.bookDelivery(request);
	}
}
