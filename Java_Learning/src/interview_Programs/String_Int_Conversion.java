package interview_Programs;

public class String_Int_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1 way
		String name="10";
		int result=Integer.parseInt(name);
		
		System.out.println(result);

		//2nd way
		int result1=Integer.valueOf(name);
		System.out.println(result1);
	}

}
