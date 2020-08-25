
package interview_Programs;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.nextLine();
		String Output="";
		
		for(int i=0;i<input.length();i++) {
			Output=input.charAt(i)+Output;
		}
		System.out.println("Output is"+" "+Output);
		
		

	}

}
