package com.vijay.bank;
//Package is collection of logical classes
public abstract class BankAccount {
	

	//static variable
	private static int autoAccountNo;

	
	// instance variable  / class variable
	//we cannot use instance variable if object is not created..
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	
	   //init block
	   //it reduces the redundancy
	   //before construstor invocation init block executed 
    		{
  		  	accountNo=++autoAccountNo;
        	}
	
	//construct use to  initialize member/class/instance variable
	//At time of object creation  constructor is automatically called..
    //constructor overloading-when variety required.....
	//default constructor
	public BankAccount(){
		accountHolderName="unknown";
		accountBalance=0;
		}
	
	//parameterize constructor
	public BankAccount(String accountHolderName,double accountBalance)
	{
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;	
	}
	
	//setter method  --reinitializing or modifying existing member variable
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public String getAccountHolderName() {
    return accountHolderName;
	}
	
      public int getAccountNo() {
		return accountNo;
	}
	
	//service methods
	public void withdraw(double amount){
	
	if(amount<=0 || amount>accountBalance || (accountBalance-amount<1000)){
			
			System.out.println("Not a Valid Transaction");
	}
	else {
		
		this.accountBalance-=amount;
		System.out.println("The new balance is: "+accountBalance);
	}	
  }
	public void deposit(double amount){
		if(amount<=0 ){
			System.out.println("Not a Valid Transaction");
		}
		else {
			this.accountBalance+=amount;
			System.out.println("The new balance is: "+accountBalance);
		}
	}
	
     public static void main(String[] args) {	
    	//BankAccount acc=new BankAccount();
       //BankAccount acc2=new BankAccount("vijay",500);
	}
}