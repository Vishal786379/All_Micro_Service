package com.project.AccountService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.AccountService.Model.AccountService;
import com.project.AccountService.Repository.AccountServiceRepository;

@Service
public class AccountServiceImpl implements AccountSer {
	
	@Autowired
	private AccountServiceRepository accountServiceRepository;

	@Override
	public AccountService saveAccount(AccountService accountService) {
		return accountServiceRepository.save(accountService);
	}

	@Override
	public List<AccountService> getAllAccount() {
		return accountServiceRepository.findAll();
	}


}
