package Looping_Statements;

public class StaticVariable {
	// static int a=1;
	
	static int b=1;
	
	public void staticMethod() {
		System.out.println(b);
		 b++;
	}
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable b1=new StaticVariable();
		b1.staticMethod();
		StaticVariable b2=new StaticVariable();
		b2.staticMethod();
		StaticVariable b3=new StaticVariable();
		b3.staticMethod();
		
	}

}
