package com.project.Ordermanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Ordermanagement.model.OrderManagement;
import com.project.Ordermanagement.model.TransactionRequest;
import com.project.Ordermanagement.service.OrderManagementServiceImpl;


@RestController
@RequestMapping("/orders")
public class OrderManagementController {
	
	@Autowired
	OrderManagementServiceImpl ormServiceImpl;
	
	@GetMapping("/getall")
	public List<OrderManagement> getallorders() {
		return ormServiceImpl.getAllOrders();
	}
	
	@PostMapping("/save")
	public OrderManagement saveorderManagement(@RequestBody TransactionRequest request) {
		return ormServiceImpl.saveOrder(request);
	}
	

}
