package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*it does not provides random access( interface implementation for searching)
		it is very efficient for insertion & deletion*/

		LinkedList<String> linkedlist=new LinkedList<String>();
		
		linkedlist.add("benz");
		linkedlist.add("volvo");
		linkedlist.add("BMW");
		
		System.out.println(linkedlist);
		
		//linkedlist methods
		
		linkedlist.addFirst("volkswagen");
		linkedlist.addLast("Hyundai");
		linkedlist.add(1, "Tata");
		System.out.println(linkedlist);
	
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		linkedlist.remove(1);
		System.out.println(linkedlist);
		
		
		linkedlist.add("volvo");
		System.out.println(linkedlist);
		linkedlist.removeFirstOccurrence("volvo");
		System.out.println(linkedlist);
		linkedlist.add("BMW");
		System.out.println(linkedlist);
		linkedlist.removeLastOccurrence("BMW");
		System.out.println(linkedlist);
		
		System.out.println("Using listIterator- forward");
		ListIterator<String> listiterator=linkedlist.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		
		System.out.println("Using listIterator- backward");
		ListIterator<String> listitertor1=linkedlist.listIterator();
		while(listitertor1.hasPrevious()) {
			System.out.println(listitertor1.previous());
		}
		
	}

}
