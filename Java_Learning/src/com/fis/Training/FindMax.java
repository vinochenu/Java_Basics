package com.fis.Training;

import java.io.InputStream;
import java.util.Scanner;

public class FindMax {

	public void findMaximum(int x,int y)  {


		System.out.println("Maximum value of first & second is "+Math.max(x,y));
		
	}
	
	public void findMaximum1(int x, int y) {
		
		
		if(x>y) {
			System.out.println("x is greater than y: "+x+">"+y);
		}
		else {
			System.out.println("y is greater than x : "+y+">"+x);
		}
	}
	
	

}
