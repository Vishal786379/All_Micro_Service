package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/LoadBalancer")
public class loadBalancerController {
	
//	@Autowired
//	private RestTemplate template;
//	
//	@GetMapping("invoke")
//	public String invokeSearch() {
//		String url="http://SearchService/search/msg";
//		return template.getForObject(url, String.class);
//	}
	
	@Autowired
	private RestTemplate template;
	

	@GetMapping("invoke")
	public String invokeSearch() {
		System.out.println("Hello");
		return template.getForObject("http://SEARCH-SERVICE/search/getallsearch", String.class);
	}

	@GetMapping("/test")
	public String test() {
		return "working....";
	}


}
