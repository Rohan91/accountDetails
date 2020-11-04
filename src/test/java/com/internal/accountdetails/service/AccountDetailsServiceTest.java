package com.internal.accountdetails.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.internal.accountdetails.entities.Account;
import com.internal.accountdetails.entities.Transactions;

class AccountDetailsServiceTest {

	@Autowired
	private AccountDetailsService accountDetailsService;
	
	@Test
	void testGetAllAccounts() {
		List<Account> getTransactions = accountDetailsService.getAllAccounts();
		assertNotNull(getTransactions);
	}

	@Test
	void testGetTransactionDetails() {
		List<Transactions> getTransactions = accountDetailsService.getTransactionDetails(123L);
		assertNotNull(getTransactions);
	}
}
