package interview_Programs;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		int reversednumber=0;
		
		while(number!=0)
		{
			reversednumber=reversednumber*10;
			reversednumber=reversednumber+number%10;
			number=number/10;
			
		}
		
		
		System.out.println("Reversed number is "+reversednumber);

	}

}
