package com.project.Supplier.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Supplier.dao.SupplierRepository;
import com.project.Supplier.model.Supplier;
import com.project.Supplier.service.SupplierServiceImpl;

@RestController
@RequestMapping("supplier")
public class SupplierController {
	
	@Autowired
	private SupplierServiceImpl supplierServiceImpl;
	
	@GetMapping("getAll")
	public List<Supplier> getAllSupplier(){
		return supplierServiceImpl.getAllSupplier();
	}
	
	@PostMapping("save")
	public Supplier saveSupplier(@RequestBody Supplier supplier) {
		return supplierServiceImpl.saveSupplier(supplier);

}
}