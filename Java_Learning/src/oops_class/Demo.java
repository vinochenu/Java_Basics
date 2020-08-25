package oops_class;

public class Demo {

	int a,b;
	//constructor
	Demo(int x,int y)
	{
		a=x;
		b=y;
	}
	//function for addition
	 public void add()
	 {
		 int c;
		 c=a+b;
		 System.out.println("value of c:"+" "+c);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Demo Obj=new Demo(1,2);
 Obj.add();
 System.out.println("Program is successful");
	}

}
