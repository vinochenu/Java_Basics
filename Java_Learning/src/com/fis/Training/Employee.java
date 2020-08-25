package com.fis.Training;

public class Employee {
	
	String name;
	double basic_salary;
	
	Employee(String name,double salary){
		this.name=name;
		this.basic_salary=salary;
	}
	
	public void display_employee() {
		System.out.println("Employee name is "+name);
		System.out.println("Basic salary is "+basic_salary);
	}

}
