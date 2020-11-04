package com.internal.accountdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.internal.accountdetails.entities.Account;
import com.internal.accountdetails.entities.Transactions;
import com.internal.accountdetails.service.AccountDetailsService;

@RestController
public class MainController {

	@Autowired
	AccountDetailsService accountDetailsService;

	@GetMapping(value = "/accounts")
	public List<Account> getAllAccounts() {
		return accountDetailsService.getAllAccounts();
	}

	@GetMapping(value = "/accounts/{id}/transactions")
	public List<Transactions> getAccountTransactions(@PathVariable long id) {
		return accountDetailsService.getTransactionDetails(id);
	}
}
