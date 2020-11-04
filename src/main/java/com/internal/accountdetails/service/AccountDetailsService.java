package com.internal.accountdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internal.accountdetails.entities.Account;
import com.internal.accountdetails.entities.Transactions;
import com.internal.accountdetails.exception.NoUserFoundException;
import com.internal.accountdetails.repositories.AccountRepository;
import com.internal.accountdetails.repositories.TransactionsRepository;

@Service
public class AccountDetailsService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionsRepository transactionsRepository;

	public List<Account> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		if (accounts.isEmpty()) {
			throw new NoUserFoundException("Sorry! No users are present currently.");
		}
		return accounts;
	}

	public List<Transactions> getTransactionDetails(long id) {
		List<Transactions> transactionDetails = transactionsRepository.getAllTransactionsForAccount(id);
		if (transactionDetails.isEmpty()) {
			throw new NoUserFoundException("Sorry! User is not present for this particular id: " + id);
		}
		return transactionDetails;
	}

}
