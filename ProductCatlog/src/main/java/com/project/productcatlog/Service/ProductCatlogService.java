package com.project.productcatlog.Service;

import java.util.List;

import com.project.productcatlog.Model.ProductCatlog;

public interface ProductCatlogService {
	
	public ProductCatlog saveProduct(ProductCatlog productcatlog);
	List<ProductCatlog> getAllProductCatlog();
}
