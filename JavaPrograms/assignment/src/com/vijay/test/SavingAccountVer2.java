package com.vijay.test;

import com.vijay.bank.SavingAccount;

public class SavingAccountVer2 extends SavingAccount implements Insurance{

	@Override
	public String getInsuranceName() {
	
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAccount() {

		return 5000;
	}
	
	

}
