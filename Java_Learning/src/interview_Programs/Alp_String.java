package interview_Programs;

public class Alp_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str="ba";
		max("ba");
		
		
	}
	
	public static void max(String s)
	{
		
	        // loop to find the max leicographic 
	        // substring in the substring array 
	        String output = ""; 
	        for (int i = 0; i < s.length(); i++) { 
	            if (output.compareTo(s.substring(i)) <= 0) { 
	            	output = s.substring(i); 
	            	System.out.println(output);
	            } 
	        } 
	  
	        //return output; 
	     
		
		

	}

}
