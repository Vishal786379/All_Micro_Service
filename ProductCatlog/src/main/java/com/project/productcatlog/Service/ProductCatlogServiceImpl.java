package com.project.productcatlog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.productcatlog.Model.ProductCatlog;
import com.project.productcatlog.Repository.ProductCatlogRepository;

@Service
public class ProductCatlogServiceImpl implements ProductCatlogService {

	@Autowired
	private ProductCatlogRepository productcatlogrepository;
	
	@Override
	public ProductCatlog saveProduct(ProductCatlog productcatlog) {
		// TODO Auto-generated method stub
//		productcatlog.setPrice(productcatlog.g);
		return productcatlogrepository.save(productcatlog);
	}

	@Override
	public List<ProductCatlog> getAllProductCatlog() {
		// TODO Auto-generated method stub
		return productcatlogrepository.findAll();
	}
	

}
