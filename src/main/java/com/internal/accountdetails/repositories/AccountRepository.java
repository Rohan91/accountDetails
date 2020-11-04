package com.internal.accountdetails.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internal.accountdetails.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
