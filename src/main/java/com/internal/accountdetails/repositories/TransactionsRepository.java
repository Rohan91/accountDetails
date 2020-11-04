package com.internal.accountdetails.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.internal.accountdetails.entities.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long>{

	@Query("Select s from Transactions s where s.account.accountNumber = ?1")
	List<Transactions> getAllTransactionsForAccount(Long id);

}
