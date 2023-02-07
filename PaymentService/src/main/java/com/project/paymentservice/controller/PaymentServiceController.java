package com.project.paymentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.paymentservice.model.Payment;
import com.project.paymentservice.service.PaymentService;
import com.project.paymentservice.service.PaymentServiceImpl;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {

	@Autowired
	private PaymentServiceImpl paymentserviceimpl;

	@PostMapping("/dopayment")
	public Payment dopayment(@RequestBody Payment payment) {
		return paymentserviceimpl.dopayment(payment);
	}

	@GetMapping("/getpayment")
	public List<Payment> getallpayment() {
		return paymentserviceimpl.getallpayment();
	}
}
