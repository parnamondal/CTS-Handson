package com.cognizant.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.repository.LoanRepository;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@Autowired
	LoanRepository repo;

	@GetMapping("/{number}")
	public Loan getLoan(@PathVariable String number) {
		return repo.getAccnumber(number);
	}
}