package com.project.Supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Supplier.dao.SupplierRepository;
import com.project.Supplier.model.Supplier;

@Service
public class SupplierServiceImpl implements Supplierservice{

	@Autowired
	private SupplierRepository spRepo;
	
	@Override
	public Supplier saveSupplier(Supplier supplier) {
		return spRepo.save(supplier);
	}
	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return spRepo.findAll();
	}

}
