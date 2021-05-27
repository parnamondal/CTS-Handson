package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
	
	private String accnumber;
	private String type;
	private double loanamt;
	private double emi;
	private int tenure;
}
