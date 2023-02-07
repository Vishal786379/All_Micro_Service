package com.project.searchservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.project.searchservice.model.Account;
import com.project.searchservice.model.Cart;
import com.project.searchservice.model.ProductCatlog;
import com.project.searchservice.model.Search;
import com.project.searchservice.model.TransactionRequest;
import com.project.searchservice.repository.SearchServiceRepository;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchServiceRepository searchservicerepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Search dosearch(TransactionRequest request) {
		// TODO Auto-generated method stub
		Account account = request.getAccount();
		Cart cart = request.getCart();
		Search search = request.getSearch();
		ProductCatlog productcatlog = request.getProductcatlog();
		
		cart.setUserId(account.getUserId());
		cart.setProductId(search.getProductId());
		cart.setProductName(search.getProductName());
		cart.setQuantity(search.getQuantity());
		
		double amount = productcatlog.getPrice()*search.getQuantity();
		cart.setTotalAmount(amount);
	
		restTemplate.postForObject("http://localhost:8087/cart/savecart", cart, Cart.class);
//		return cartRepository.save(cart);
		return searchservicerepository.save(search);
		
	}

	@Override
	public List<Search> getallsearch() {
		// TODO Auto-generated method stub
		return searchservicerepository.findAll();
	}

	

}
