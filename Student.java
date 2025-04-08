package com.spec;

public class Student {
	//Properties
	String studName;
	int id;
	String branch;
	String mobile;
	String email;
	
	//Methods
	void setDetails(String name,int sid,String br,String mob,String mail) {
		studName=name;
		id=sid;
		branch=br;
		mobile=mob;
		email=mail;
	}
	void getDetails() {
		System.out.println("Name : "+studName);
		System.out.println("Id : "+id);
		System.out.println("Branch : "+branch);
		System.out.println("Mobile : "+mobile);
		System.out.println("Email : "+email);
	}

}
