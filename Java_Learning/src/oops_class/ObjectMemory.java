package oops_class;

public class ObjectMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMemory obj=new ObjectMemory();
		ObjectMemory obj1=new ObjectMemory();//with ref
		new ObjectMemory();//without ref 
		System.out.println(obj);
		System.out.println(obj1);
	}

}
