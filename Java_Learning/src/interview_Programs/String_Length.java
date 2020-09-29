package interview_Programs;

import java.util.Scanner;

public class String_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("enter the string");
		
		Scanner scanner=new Scanner(System.in);
		
		String input=scanner.nextLine();
		
		//using length function
		 System.out.println("String Length using function is "+input.length());
		 
		 //without function
		 
		char[] array= input.toCharArray();
		int stringlength=0;
		
		for (char c : array) {
			stringlength++;
		}
		
		System.out.println("String Length using without function is "+stringlength);

	}

}
