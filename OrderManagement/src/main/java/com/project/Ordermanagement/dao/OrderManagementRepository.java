package com.project.Ordermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Ordermanagement.model.OrderManagement;


@Repository
public interface OrderManagementRepository extends JpaRepository<OrderManagement, Integer>{
	

}
