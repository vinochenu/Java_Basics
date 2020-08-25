package com.fis.Training;

public class Account {
	
	int acc_no;
	String name;
	double balance;
	
	Account(int acc_no,String name,double balance){
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
		
	}
	
	public void displayAccount() {
		
		System.out.println("Account no is "+acc_no);
		System.out.println("Account name is "+name);
		System.out.println("Account balance is "+balance);
		
	}
	
	

}
