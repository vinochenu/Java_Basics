package interview_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int input=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<input-1;i++ ) {
			if(input%i==0) {
				flag=1;
				break;
				
			}
		}
		if(flag==1) {
			System.out.println("value is not prime number");
		}
		else {
			System.out.println("value is a prime number");
		}
		

	}

}
