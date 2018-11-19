package com.vijay.test;


import com.vijay.bank.BankAccount;
import com.vijay.bank.CurrentAccount;
import com.vijay.bank.SavingAccount;

public class TestBankAccount {

	
	
	public static void testBankAccountMethod()
	{
//	BankAccount acc=new BankAccount();
	//    acc.setAccountHolderName("vijay");
	
	}
	
	public static  void testSavingAccount()
	
	{
		SavingAccount savingAcc=new SavingAccount("vijay kumar",8000,true);
		System.out.println("Account no is "+savingAcc.getAccountNo());
		System.out.println("Account holder name"+savingAcc.getAccountHolderName());
		System.out.println("Account no is "+savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("Account no is "+savingAcc.getAccountNo());
		System.out.println("---------------");
		savingAcc.withdraw(3000);
		System.out.println("AccountBalance"+savingAcc.getAccountBalance());
		
	}
	
	
	
	public static void testCurrentAccount()

	
	{
		CurrentAccount currentAcc= new CurrentAccount("KumarVijay",40000);
		System.out.println("Account no is "+currentAcc.getAccountNo());
		System.out.println("od limit"+currentAcc.odlimit);
		System.out.println("Account holder name"+currentAcc.getAccountHolderName());
		System.out.println("Account no is "+currentAcc.getAccountNo());
		//currentAcc.deposit(5000);
		//System.out.println("Account no is "+currentAcc.getAccountBalance());
		System.out.println("---------------");
		currentAcc.withdraw(50000);
		System.out.println("od limit"+currentAcc.odlimit);
		System.out.println("AccountBalance"+currentAcc.getAccountBalance());
	}
	
	
	
	public static BankAccount getBankAccount (String accountType) {
		
		BankAccount acc=null;
		if(accountType.equals("Saving")){
			acc=new SavingAccount("onkar",4000);
		}
		else if(accountType.equals("Current")){
			acc=new CurrentAccount("Rahul",7000);
		}
		else{
			acc=null;
		}
			return acc;
	}
	public static void main(String[] args) {
//		testBankAccountMethod();
//		testCurrentAccount();
//		testSavingAccount();
//		BankAccount acc=getBankAccount("Current");
//		System.out.println("Account Name"+acc.getAccountHolderName());
//		System.out.println("Account Balance"+acc.getAccountBalance());
          
		SavingAccountVer2 acc=new SavingAccountVer2();
		acc.withdraw(4000);
		acc.deposit(4000);
		acc.isSalaryAccount();
		acc.getInsuranceName();
		
		}
	}