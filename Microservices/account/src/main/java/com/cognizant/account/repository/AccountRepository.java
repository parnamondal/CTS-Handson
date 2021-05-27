package com.cognizant.account.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cognizant.account.model.Account;

@Repository
public class AccountRepository {
	
	private Map<String, Account> accounts;
	
	@PostConstruct
	public void init() {
		Account a1=new Account("00987987973432", "savings", 234343);
		accounts=new HashMap<>();
		accounts.put(a1.getAccnumber(), a1);
	}
	
	public Account getAccount(String number) {
		return accounts.get(number);	
		
	}

	
}
