package com.cognizant.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;
import com.cognizant.account.repository.AccountRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	AccountRepository repo;
	
	@GetMapping("/{number}")
	public Account getAccount(@PathVariable String number) {
		return repo.getAccount(number);
	}

}
