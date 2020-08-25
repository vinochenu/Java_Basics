package com.fis.Training;

public class MethodOverloadingExample {
	
	public void addition(int  x,float y,double z) {
		double a=x+y+z;
		System.out.println("Addition of first method is "+a);
		
	}
	
	public void addition(double d, int i) {
		
		int b=(int) (d+i);
		System.out.println("Addition is second method is "+b);
		
	}
	
	

}
