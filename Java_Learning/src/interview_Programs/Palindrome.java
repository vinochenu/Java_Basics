package interview_Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String input=sc.nextLine();
		String output="";
		for(int i=0;i<input.length();i++) {
			output=input.charAt(i)+output;
			}
		if(input.equals(output)) {
			System.out.println("Entered value is palindrome");
		}
		else {
			System.out.println("Entered value is not palindrome");
		}

	}

}
