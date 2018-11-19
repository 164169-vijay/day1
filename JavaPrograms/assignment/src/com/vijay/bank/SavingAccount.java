package com.vijay.bank;

public class SavingAccount extends BankAccount {

        private boolean isSalaryAccount;
        
        public SavingAccount(String accountHolderName, float accountBalance){
        super(accountHolderName,accountBalance);	
       }

        public SavingAccount() {
		}
        
public SavingAccount(String accountHolderName, float accountBalance, boolean isSalaryAccount)
        {
        super(accountHolderName,accountBalance);
        this.isSalaryAccount=isSalaryAccount;
        }

      public boolean isSalaryAccount(){
    	  return isSalaryAccount;
      }
    	 public void withdraw(double amount){
    		 this.accountBalance-=amount;
    	 }
    		 
    		 
    		 
    
      }