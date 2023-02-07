package com.project.AccountService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.AccountService.Model.AccountService;
import com.project.AccountService.Service.AccountServiceImpl;

@RestController
@RequestMapping("/account")
public class AccountServiceController {
	
	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	@PostMapping("/addaccount")
	public AccountService saveAccount(@RequestBody AccountService accountService){
		return accountServiceImpl.saveAccount(accountService);
	}
	
	@GetMapping("/getall")
	public List<AccountService> getAllAccount(){
		return accountServiceImpl.getAllAccount();
	}

}
