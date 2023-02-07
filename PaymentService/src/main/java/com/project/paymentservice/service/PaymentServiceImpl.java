package com.project.paymentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.paymentservice.model.Payment;
import com.project.paymentservice.repository.PaymentServiceRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentServiceRepository paymentservicerepository;

	@Override
	public Payment dopayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentservicerepository.save(payment);
	}

	@Override
	public List<Payment> getallpayment() {
		// TODO Auto-generated method stub
		return paymentservicerepository.findAll();
	}
}
