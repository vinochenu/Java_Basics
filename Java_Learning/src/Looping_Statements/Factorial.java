package Looping_Statements;

class Factorial{  
	 public static void main(String args[]){  
	int fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(int i=1;i<=number;i++){    
	      fact=fact*i;   
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);   
		 
		 
		//own code
		 
		/* for (int n=1;n<=10;n++)
		 {
		 int fact;
		 fact=(n*(n-1)*(n-2)*(n-3)*(n-4));
		 System.out.println("factorial of"+" "+n+" "+"is"+" "+fact);
		 }*/
	 }  
	} 
