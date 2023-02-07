package com.project.paymentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.paymentservice.model.Payment;

@Repository
public interface PaymentServiceRepository extends JpaRepository<Payment, Integer> {

}
