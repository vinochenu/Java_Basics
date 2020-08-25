package interview_Programs;

public class Swap_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="LOVE";
		String b="YOU";
		
		System.out.println("Before swap: " + a + " " + b); 
		
	   a=a+b;
	   
	   System.out.println(a);
	   
	   b=a.substring(0,a.length()-b.length());
	   	  
	   a= a.substring(b.length());
	   
	   System.out.println("After : " + a + " " + b); 
	   	  
	   
	}}
	  
	  
	 
		   /* public static void main(String args[]) {  
		        String a = "Love";  
		        String b = "You";  
		        System.out.println("Before swap: " + a + " " + b);  
		        a = a + b;  
		        b = a.substring(0, a.length() - b.length());  
		        a = a.substring(b.length());  
		        System.out.println("After : " + a + " " + b);  
		    }  
	*/
	   
		
		

	


