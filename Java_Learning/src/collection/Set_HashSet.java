package collection;

import java.util.HashSet;

public class Set_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NOTE:
				/*it wont follow insertion order
				it will allow heterogenous object if generics are not mentioned
				it wont allow duplicate values to add
				it will allow to add NULL 1 time
				default size is 16
				load factor=0.75 
		if its added- new element added=load size+0.75 which is 12*/
		
		HashSet<String> hashset=new HashSet<String>(); 
		hashset.add("KTM");
		hashset.add("pulsar");
		hashset.add("Apache");
		hashset.add("bullet");
		//adding null value- it will add one null 
		hashset.add(null);
		System.out.println(hashset);
		//adding null value- it wont add 2nd time null 
		hashset.add(null);
		System.out.println(hashset);

		//adding duplicate values- it wont add onto list
		hashset.add("KTM");
		hashset.add("pulsar");
		System.out.println(hashset);
		
		
		int hascode=hashset.hashCode();
		System.out.println(hascode);
		
	}

}
