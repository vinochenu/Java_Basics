package Looping_Statements;

public class TestWhile {
	
	public void odd()
	{
		int i=1;
		
		
		while(i<100)
		{
			System.out.printf("%d  ",i);
			
			i=i+2;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWhile obj=new TestWhile();
		obj.odd();
	}

}
