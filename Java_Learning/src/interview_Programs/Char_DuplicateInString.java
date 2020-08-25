package interview_Programs;

import java.util.Scanner;

public class Char_DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		String input=sc.nextLine();
		int flag=0;
		
		char arr[]=input.toCharArray();
		
		System.out.println("Duplicates are");
		
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					flag=1;
					break;
				}
			}
		}
		
		
		

	}

}
