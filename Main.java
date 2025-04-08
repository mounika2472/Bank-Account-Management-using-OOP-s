package com.spec;

public class Main {

	public static void main(String[] args) {
		
		Student s1;//reference
		s1=new Student();//object,have memory 
		
		s1.setDetails("swapna", 123, "cse", "9090909090", "swapna@gmail.com");
		s1.getDetails();		
		Student s2=new Student();
		s2.setDetails("amit", 567, "cse", "9898989898", "amit@gmail.com");
		
		BankAccount ba=new BankAccount();//object to bank account
		//jvm supplies default constructor
		//default constructor supplies default values to properties
		
		System.out.println(ba.accountHolderName);
		System.out.println(ba.accountId);
		System.out.println(ba.iFSC);
		System.out.println(ba.branchLoc);
		System.out.println(ba.balance);
		//parameterised constructor assigns values to properties
		
		BankAccount ba1=new  BankAccount(12345,"sruthi", 
				"icic00069", "Medchel", 20000);
		System.out.println(ba1.accountHolderName);
		System.out.println(ba1.accountId);
		System.out.println(ba1.iFSC);
		System.out.println(ba1.branchLoc);
		System.out.println(ba1.balance);
		
		ba1.withDraw(5000);
		ba1.deposit(15000);
		
	}

}
