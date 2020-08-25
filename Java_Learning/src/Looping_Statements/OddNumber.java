package Looping_Statements;

import java.util.Scanner;

public class OddNumber {

	private static Scanner object;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" "+"is an odd number");
			}
			else
			{
				System.out.println(i+" "+"is not an odd number");
			}
		}*/
		
		object = new Scanner(System.in);
		int num=object.nextInt();
		if(num%2!=0)
		{
			System.out.println(num+" "+"is an odd number");
		}
		else
		{
			System.out.println(num+" "+"is not an odd number");
		}

	}

}
