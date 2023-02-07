package com.project.Supplier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Supplier.model.Supplier;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

	
}
