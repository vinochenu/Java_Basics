package Looping_Statements;

import java.util.Scanner;

public class PrimeNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	sc = new Scanner(System.in);
	int number=sc.nextInt();
	
	int flag=0;
		
		for(int i=2;i<number;i++)
		{
			if((number%i)==0)
			{
				flag=1;
				break;
			}
			}
			if(flag==1)
			{
				System.out.println(number+" "+"is a not prime number");
			}
			else
			{
				System.out.println(number+" "+" is a prime number");
			}
		}
		
		}

	
