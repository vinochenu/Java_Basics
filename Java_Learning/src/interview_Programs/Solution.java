package interview_Programs;

import java.util.Scanner;

public class Solution {
	
	public int getEnergy() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entr ngy no");
		int energyNO=scanner.nextInt();
		
		int output=0;
		
		int [] arr=new int[energyNO];
		
		System.out.println("Entr ngy");
		
		for(int i=0;i<arr.length;i++)
			
		{
			
			arr[i]=scanner.nextInt();
			output=arr[i]+output;
			System.out.println("Total enry "+output);
		}
		
		return output;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution=new Solution();
		solution.getEnergy();

	}

}
