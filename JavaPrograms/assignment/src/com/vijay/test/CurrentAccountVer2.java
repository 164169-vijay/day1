package com.vijay.test;

import com.vijay.bank.CurrentAccount;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{

	public CurrentAccountVer2(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		
	}

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getInsuranceAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

}

	
	
	
	
	


