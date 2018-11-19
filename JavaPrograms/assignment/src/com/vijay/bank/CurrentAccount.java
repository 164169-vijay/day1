package com.vijay.bank;

public class CurrentAccount extends BankAccount{
	
	public  double odlimit=20000;
	  //double remBalance=0;

      public	CurrentAccount(String accountHolderName,double accountBalance){
		super(accountHolderName,accountBalance);
	}
      
       public void withdraw(double amount){
 	  if(amount<accountBalance){
 		
 		 accountBalance-=amount;
        	}
 	  else if (amount>accountBalance) {
 		   double cutamt=amount-accountBalance;
 			  if(odlimit-cutamt>=0){
 			    	odlimit=odlimit-cutamt;
 				         accountBalance=accountBalance+cutamt-amount;
 	 			 }
	 		 else{
 			 System.out.println("invalid amount");
 		 }
  	 }		
}
public double getOdlimit() {
	return odlimit;
}


} 
      
      
	
	


