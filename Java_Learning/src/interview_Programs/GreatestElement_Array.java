package interview_Programs;

import java.util.Arrays;

public class GreatestElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] array= {1, 4, 6,9, 8, 5};
		
		int greatestelement=Integer.MIN_VALUE;
		
		for (int i : array) {
			
			if(greatestelement<i)
				
				greatestelement=i;
		}
		System.out.println("Greatest element is "+greatestelement);
		
		
		/*Arrays.sort(array);
		System.out.println("Greatest element is "+array[array.length-1]);*/
	}

}
