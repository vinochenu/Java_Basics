package interview_Programs;

import java.util.Arrays;
import java.util.Collections;

public class SmallestElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= {6,4,1,2,3};


		//Using loop
		int smallestelement=Integer.MAX_VALUE;

		for (int i : array) 
			if(smallestelement>i) {

				smallestelement=i;
			}

		System.out.println(smallestelement);

		//Using Arrays class

		Arrays.sort(array);
		System.out.println("Smallest element is "+array[0]);;



	}}

