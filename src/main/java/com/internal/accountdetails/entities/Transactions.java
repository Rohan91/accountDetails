package com.internal.accountdetails.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Transactions {

	@Id
	private long transactionId;

	private LocalDate transactionDate;

	@Column(nullable = true)
	private Integer debitAmount;

	@Column(nullable = true)
	private Integer creditAmount;

	private String transactionType;

	@ManyToOne
	private Account account;

	public long getTransactionId() {
		return transactionId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public Integer getDebitAmount() {
		return debitAmount;
	}

	public Integer getCreditAmount() {
		return creditAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public Account getAccount() {
		return account;
	}

}
