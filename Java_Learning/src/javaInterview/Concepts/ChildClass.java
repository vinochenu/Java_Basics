package javaInterview.Concepts;

public class ChildClass extends ParentClass{

	public static void demo() // we cant override static method if we do , it is considered as "method hiding" it will hide the super class method
	{
		System.out.println("Child method");
	}
	
	private void demo1()  // we cant override private method since it is access only within class
	{
		System.out.println("Private method in child class");
	}
	
	public static void main(String[] args) {
		ChildClass childClass=new ChildClass();
		childClass.demo1();
		childClass.demo();// we can still create object & access the static method in main method but not recommendable
	}
}
