package interview_Programs;

import java.util.Scanner;

public class Odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int input=sc.nextInt();
		
		if(input%2==0) {
			System.out.println("value is not odd number");
		}
		else {
			System.out.println("value is odd number");
		}
	}

}
