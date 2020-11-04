package com.internal.accountdetails.entities;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

	@Id
	private long accountNumber;

	private String accountName;

	private String accountType;

	private LocalDate creationDate;

	private String currency;

	private int openingBalance;

	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
	private List<Transactions> transactions;

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public String getCurrency() {
		return currency;
	}

	public int getOpeningBalance() {
		return openingBalance;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

}
