package com.fis.Training;

public class Master {

	public static void main(String[] args) {
		
		
		Account account=new Account(123, "vinod", 300000);
		account.displayAccount();
		
		Book book=new  Book("java", "pranav",750.50f);
		book.display_book();
		
		Employee employee=new Employee("vinod", 5000);
		employee.display_employee();
		
		Person person=new Person("vino",29);
		person.display_person();
		
		AreaCalculation areaCalculation=new AreaCalculation(30.5f,20.4f, 10.5f);
		System.out.println("Area of rectangle is "+areaCalculation.areaRectangle());
		System.out.println("Area of cube is "+areaCalculation.areaCube());
		

		MethodOverloadingExample example=new MethodOverloadingExample();
		example.addition(10, 20.5f, 100000);
		example.addition(200000, 3);
		
		CitiBank citiBank=new CitiBank();
		citiBank.personalLoan();
		
		FindMax max=new FindMax();
		max.findMaximum(35,45);
		max.findMaximum1(20,15);
		
		
	}

}
