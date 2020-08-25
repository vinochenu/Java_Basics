package collection;

import java.util.TreeSet;

public class Set_TreeSet {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*it will retrieve in ascending order in default
		it will allow heterogenous object if generics are not mentioned
		it wont allow duplicate values to add
		it wont allow to add NULL - after JAVA 1.6
		default size is 16
		load size=0.75
	if its added- new element added=load size+0.75
	COMPARATOR INTERFACE- this TREEMAP will implement COMPARATOR INTERFACE for sorting*/
		
		TreeSet<String> treeset=new TreeSet<String>();
		treeset.add("idly");
		treeset.add("chapathi");
		treeset.add("dosa");
		treeset.add("kurma");
		System.out.println(treeset);
	
		
		TreeSet<Integer> treeset1=new TreeSet<Integer>();
		//treeset1.add(null); - > it wont allow to add null after JAVA 1.6
		treeset1.add(30);
		// adding duplicate value- > it wont add in the set
		treeset1.add(30);
		treeset1.add(40);
		
		treeset1.add(20);
		treeset1.add(10);
		//treeset1.add(null); // we cant add null values in TreeSet - Null pointer Exception ( since it will sort by ascending, it can't compare with null
		System.out.println(treeset1);
		
		
		//Set Methods
		
		System.out.println("*********");
		
		System.out.println(treeset1.headSet(40));// it will return the element which is less than 40
		System.out.println(treeset1.tailSet(30));//it will return 30 & higher element than 30
		System.out.println(treeset1.subSet(20, 30));// it will return 20 & less than 30 (30 wont include)
		
		System.out.println("*********");
	
		System.out.println(treeset1); 
		System.out.println(treeset1.pollFirst()); // it will return the first(lowest) value & it remove from the set
		System.out.println(treeset1);
		
		System.out.println(treeset1.pollLast());// it will return the last(highest) value & it remove from the set
		System.out.println(treeset1);
		
		System.out.println(treeset1.first()); // it will return the first (lowest) element in set 
		System.out.println(treeset1);
		System.out.println(treeset1.last());// it will return the last (highest) element in set
		System.out.println(treeset1);
		
		treeset1.add(10);
		treeset1.add(40);
		treeset1.add(60);
		
		System.out.println(treeset1);
		
		System.out.println(treeset1.higher(40)); // it will return the least element in set which is greater than 40
		System.out.println(treeset1.lower(40)); //it will return the greater element in set which is lesser than 40

	}

}
