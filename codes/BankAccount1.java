package com.vijay.codes;

public class BankAccount1 {
	//static variable
	private static int autoAccountNo;

	
	// instance variable  / class variable
	//we cannot use instance variable if object is not created..
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	
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
	public BankAccount1(){
		accountHolderName="unknown";
		accountBalance=0;
		}
	
	//parameterize constructor
	public BankAccount1(String accountHolderName,double accountBalance)
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
		this.accountBalance -= amount;
		}
	public void deposit(double amount){
		this.accountBalance+=amount;
	}
	
     public static void main(String[] args) {	
    	 BankAccount1 acc=new BankAccount1();
    	 BankAccount1 acc2=new BankAccount1();
     }
}
