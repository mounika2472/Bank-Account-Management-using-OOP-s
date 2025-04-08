package com.spec;

public class BankAccount {
	
	long accountId;
	String accountHolderName;
	String iFSC;
	String branchLoc;
	double balance;
	//constructor name is class name itself
	//it is a spl method without having return type
	//jvm invokes constructor
	public BankAccount() {
		System.out.println("default constructor");
	}//default constructor
	
	
	//Parameterized constructor
	public BankAccount(long accountId,String accountHolderName,
	String iFSC,String branchLoc,double balance){
		this.accountHolderName=accountHolderName;
		this.accountId=accountId;
		this.iFSC=iFSC;
		this.branchLoc=branchLoc;
		this.balance=balance;//this refers to current obj ref
	
	}
	
	
	
	void withDraw(double amount) {
		
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdrawn");
		}
		else
		{
			System.out.println("in sufficient funds");
		}
			
		
	}
	
	void deposit(double amount) {
		
		balance=balance+amount;
		System.out.println("amount deposited");
		
	}
	

}
