package com.fis.Training;

public class Person {
	
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void display_person() {
		System.out.println("person name is "+name);
		System.out.println("person age is "+age);
	}

}
