package com.project.Supplier.service;

import java.util.List;

import com.project.Supplier.model.Supplier;

public interface Supplierservice {
	
	public Supplier saveSupplier(Supplier supplier);
	
	public List<Supplier> getAllSupplier();

}
