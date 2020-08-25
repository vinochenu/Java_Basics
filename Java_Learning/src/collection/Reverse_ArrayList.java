package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Reverse_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("reverse the array list");
		
		/*ListIterator<Integer> iterator1=list.listIterator();
		while(iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());
		}*/
		
		System.out.println("Reverse order is ");
		
		Collections.reverse(list);
	Iterator<Integer> iterator2=list.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
			
			
		}
		
		System.out.println("***********");
		
		System.out.println("max value is "+Collections.max(list));
		
		System.out.println("min value is "+Collections.min(list));
		

	

		
	}

}
