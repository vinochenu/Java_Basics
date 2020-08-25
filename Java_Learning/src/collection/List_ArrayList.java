package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//NOTE:
		/*it will follow insertion order
		it will allow heterogenous object if generics are not mentioned
		it will allow duplicate
		it will allow to add NULL
		it provides random access( interface implementation for searching)
		default size is 10
		if its added- new element added=existing size+ existingsize/2 */
		
		List<String> arraylist=new ArrayList<String>();
		
		arraylist.add("vinod");
		arraylist.add("kumar");
		arraylist.add("selenium");
		arraylist.add("selenium");
		
		
		System.out.println(arraylist);
		System.out.println(arraylist.hashCode());
		
		//adding null value- it will allow to add
		arraylist.add(null);
		//adding 2 time null value- ot will allow to add
		arraylist.add(null);
		//adding duplicate value- it will allow to add
		arraylist.add("vinod");
		
		System.out.println(arraylist);
		
		//get the values by for each
		System.out.println("Using for each");
		
		for (String list : arraylist) {
			
			System.out.println(list);
			
		}
		
		//get the values by for loop
		System.out.println("Using for loop");
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		//get the values by iterator
		System.out.println("Using iterator");
		
		Iterator<String> iterator=arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Using ListIterator");
		
		ListIterator<String> listiterator=arraylist.listIterator();
		while(listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		
		System.out.println("Arraylist methods");
		
		//methods in List
		
		//is empty
		Boolean result=arraylist.isEmpty();
		System.out.println(result);
		
		//remove
		arraylist.remove("selenium");
		System.out.println(arraylist);
		
		//contains
		Boolean result1=arraylist.contains("selenium");
		System.out.println(result1);
		
		//size
		int size=arraylist.size();
		System.out.println(size);
		
		//set-update
		arraylist.set(1, "palanisamy");
		System.out.println(arraylist);
		
		//indexOf- index value of object
		int indexvalue=arraylist.indexOf("palanisamy");
		System.out.println(indexvalue);
		
		//indexOf- index value of object which is not available- result will be -1
		int indexvalue1=arraylist.indexOf("QTP");
		System.out.println(indexvalue1);
		
		
		List<String> arraylist1=new ArrayList<String>();
		arraylist1.addAll(arraylist);
		System.out.println(arraylist1);
		
		arraylist1.clear();
		System.out.println(arraylist1);
		
		arraylist1.addAll(arraylist);
		
		boolean result3=arraylist1.containsAll(arraylist);
		System.out.println(result3);
		
		int hascode=arraylist1.hashCode();
		System.out.println(hascode);
		
		
		
		
		
		

	}

}
