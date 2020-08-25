package collection;

public class Exception {
	
	int c;
	int div(int x, int y) {
		try {
		
		c=x/y;
		
	}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exception exception=new Exception();
		exception.div(10, 0);
		
	}

}
