package com.cognizant.loan.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cognizant.loan.model.Loan;

@Repository
public class LoanRepository {
	Map<String, Loan> loans;
	
	@PostConstruct
	public void init() {
		Loan l1=new Loan("H00987987972342", "car", 40000,3258,18);
		
		loans=new HashMap<String, Loan>();
		
		loans.put(l1.getAccnumber(), l1);
	}
	
	public Loan getAccnumber(String number) {
		return loans.get(number);
	}
}