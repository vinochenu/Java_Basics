package interview_Programs;

import java.util.Scanner;

public class SortingArray_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[]={10,20,30,40};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				int k=j+1;
				if(arr[j]<arr[k]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}}
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				
				
			}
		
		
		
	}


