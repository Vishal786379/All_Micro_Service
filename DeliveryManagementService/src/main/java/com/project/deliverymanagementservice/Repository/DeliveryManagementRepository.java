package com.project.deliverymanagementservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.deliverymanagementservice.model.DeliveryManagement;

@Repository
public interface DeliveryManagementRepository extends JpaRepository<DeliveryManagement, String> {

}
