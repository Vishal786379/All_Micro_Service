package com.project.AccountService.Service;

import java.util.List;

import com.project.AccountService.Model.AccountService;

public interface AccountSer {
	
	AccountService saveAccount(AccountService accountService);
	List<AccountService> getAllAccount();
}
