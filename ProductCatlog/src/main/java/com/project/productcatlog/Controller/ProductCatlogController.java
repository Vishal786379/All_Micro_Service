package com.project.productcatlog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.productcatlog.Model.ProductCatlog;
import com.project.productcatlog.Service.ProductCatlogServiceImpl;

@RestController
@RequestMapping("/productcatlog")
public class ProductCatlogController {

	@Autowired
	private ProductCatlogServiceImpl prodoctcatlogserviceimpl;
	
	@PostMapping("saveproduct")
	private ProductCatlog saveProduct(@RequestBody ProductCatlog productcatlog) {
		return prodoctcatlogserviceimpl.saveProduct(productcatlog);
	}
	
	@GetMapping("/getallproductcatlog")
	public List<ProductCatlog> getAllProductCatlog() {
		return prodoctcatlogserviceimpl.getAllProductCatlog();
	}
	
}
