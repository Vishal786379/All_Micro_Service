package com.project.cartservice.Service;

import java.io.ObjectInputFilter.Config;


import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.session.RedisSessionProperties.ConfigureAction;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mysql.cj.xdevapi.SessionFactory;
import com.project.cartservice.Model.Account;
import com.project.cartservice.Model.Cart;
//import com.project.cartservice.Model.HibernateUtil;
import com.project.cartservice.Model.OrderManagement;
import com.project.cartservice.Model.ProductCatlog;
import com.project.cartservice.Model.TransactionRequest;
import com.project.cartservice.Repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Cart saveCart(TransactionRequest request) {
		// TODO Auto-generated method stub
		
		Cart cart = request.getCart();
		Account account = request.getAccount();
		ProductCatlog productcatlog = request.getProductcatlog();
		OrderManagement orderManagement = request.getOrderManagement();
		
//		productcatlog.setProductId(cart.getProductId());
//		productcatlog.setProductName(cart.getProductName());
		
		account.setUserId(cart.getUserId());
		double amount = productcatlog.getPrice()*cart.getQuantity();
		cart.setTotalAmount(amount);
		
		orderManagement.setUserId(cart.getUserId());
		orderManagement.setProductId(cart.getProductId());
		orderManagement.setProductName(cart.getProductName());
		orderManagement.setTotalAmount(amount);
//		orderManagement.setTotalAmount(cart.getTotalAmount());
		
		
		//tocall order
		//restTemplate.postForObject("http://localhost:8089/orders/gelall", cart, Cart.class);
//		restTemplate.postForObject("http://localhost:8084/productcatlog/saveproduct", productcatlog, ProductCatlog.class);
		restTemplate.postForObject("http://localhost:8088/orders/save", orderManagement, OrderManagement.class);
		return cartRepository.save(cart);
		
	}


}
