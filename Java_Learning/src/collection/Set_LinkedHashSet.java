package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet {
	
	/*it will follow insertion order
	it will allow heterogenous object if generics are not mentioned
	it wont allow duplicate values to add
	it will allow to add NULL 1 time
	default size is 16
	load size=0.75
if its added- new element added=load size+0.75*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> linkedhashset= new LinkedHashSet<String>();
		linkedhashset.add("sambar");
		linkedhashset.add("brinjal");
		linkedhashset.add("rasam");
		//adding null
		linkedhashset.add("");
		//adding null
		linkedhashset.add(null);// will add 1 time
		linkedhashset.add(null);// it wont add for 2nd time
		
		//adding duplicate- wont add
		linkedhashset.add("brinjal");
		System.out.println(linkedhashset);
		linkedhashset.remove("brinjal");
		System.out.println(linkedhashset);
		
		//iterate a value
		Iterator<String> iterator=linkedhashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//using for each
		for (String list : linkedhashset) {
			System.out.println(list);
			
		}
		

	}

}
