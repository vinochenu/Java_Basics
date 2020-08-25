package interview_Programs;

import java.util.Scanner;

public class Bubble_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbercount");
	    int n=sc.nextInt();//to give how many numbers going to sort
	    
	    int arr[]=new int[n]; // declare array to store numbers
	    
	    System.out.println("Enter the numbers");
	    
	    //10 20 30 50 40 60
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt(); //to store numbers by using loop
	        }
	    
	    for (int i=0;i<n;i++) {
	    	
	    	for(int j=0;j<n-1;j++) {
	    		int k=j+1;//to compare the 2 numbers
	    		if(arr[j]>arr[k]) { // if it is not in order , swap the numbers 
	    			int temp=arr[j];
	    			arr[j]=arr[k];
	    			arr[k]=temp;
	    			
	    		}
	    	}
	    }
	    
	    for(int i=0;i<n;i++) {
	    	System.out.println(arr[i]); //after sorting , print the numbers
	    }
	    
	    
	   
	

	}

}
