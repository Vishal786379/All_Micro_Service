package com.project.paymentservice.service;

import java.util.List;

import com.project.paymentservice.model.Payment;

public interface PaymentService {
	public Payment dopayment(Payment payment);
	List<Payment> getallpayment();
}
