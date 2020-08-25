package parameters_arguments;

public class MainClass {
	
	
	public static int add(int x, int y) {
		int z=x+y;
		return z;
	}
	
	public static int sub(int x, int y) {
		int a=x-y;
		return a;
	}
	
	public static void main(String [] args) {
		Arithmetic_Operators arithmetic_Operators=new Arithmetic_Operators();
		
		arithmetic_Operators.valuepassing_add();
		arithmetic_Operators.valuepassing_sub();
	
	}	
}