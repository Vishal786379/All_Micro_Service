package com.project.cartservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cartservice.Model.Cart;
import com.project.cartservice.Service.CartService;
import com.project.cartservice.Service.CartServiceImpl;
import com.project.cartservice.Model.TransactionRequest;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartServiceImpl cartServiceimpl;

	@PostMapping("/savecart")
	public Cart saveCart(@RequestBody TransactionRequest request)
	{
		return cartServiceimpl.saveCart(request);
	}
}
