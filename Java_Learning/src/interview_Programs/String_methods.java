package interview_Programs;

public class String_methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String literal
		String name="vinod";
		name="riya";
		System.out.println(name);
		
		//String "new" keyword
		String name1=new String("ravi");
		System.out.println(name1);
		
		//String methods
		
		//to get length of string
		System.out.println(name.length());
		
		//to get the char by using index in string
		System.out.println(name.charAt(1));
		
		//to verify string is empty ?
		System.out.println(name.isEmpty());
		
		//to add text in existing string
		System.out.println(name.concat("kumar"));
		
		//String is immutable
		System.out.println(name);
		
		//to change into upper case
		System.out.println(name.toUpperCase());
		
		//to change into lower case
		System.out.println(name.toLowerCase());
		
		//to crop the string
		System.out.println(name.substring(1, 3));
		
		//valueOf
		int number=3;
		System.out.println(String.valueOf(number));
		
		//indexOf
		System.out.println(name.indexOf("a"));
		
		
		

	}

}
