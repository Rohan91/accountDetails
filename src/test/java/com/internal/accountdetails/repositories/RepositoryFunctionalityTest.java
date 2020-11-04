package com.internal.accountdetails.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.internal.accountdetails.entities.Account;
import com.internal.accountdetails.entities.Transactions;

@SpringBootTest
class RepositoryFunctionalityTest {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionsRepository transactionsRepository;

	@Test
	void testIfAllUsersArePickedUp() {
		List<Account> findAll = accountRepository.findAll();
		assertNotNull(findAll);
	}

	@Test
	void testIfAParticularUserIsPickedUp() {
		Optional<Account> userOne = accountRepository.findById(123L);
		assertEquals(123L, userOne.get().getAccountNumber());

	}

	@Test
	void testIfTransactionsAreRetrievedViaUser() {
		List<Transactions> getTransactions = accountRepository.findById(123L).get().getTransactions();
		assertNotNull(getTransactions);
	}

	@Test
	void testIfTransactionsAreRetrievedUsingForeignKey() {
		List<Transactions> getTransactions = transactionsRepository.getAllTransactionsForAccount(123L);
		assertNotNull(getTransactions);
	}

}
