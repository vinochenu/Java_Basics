package collection;

import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector=new Vector<String>();
		vector.addElement("tv");
		vector.add("radio");
		vector.add("tv");
		vector.add(1, "fridge");
		
		System.out.println(vector);
		vector.removeElement("radio");
		vector.remove("tv");
		
		vector.addElement("NULL");
		vector.addElement("NULL");
		
		System.out.println(vector);

	}

}
