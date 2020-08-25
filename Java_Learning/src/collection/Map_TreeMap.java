package collection;

import java.util.TreeMap;

public class Map_TreeMap {
	
	// COMPARATOR INTERFACE- this TREEMAP will implement COMPARATOR INTERFACE for sorting

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> treemap=new TreeMap<Integer,String>();
		
		treemap.put(1, "apple");
		treemap.put(5, "berry");
		treemap.put(3, "melon");
		treemap.put(2, "orange");
		//treemap.put(null, "mango"); // we can't add null key in Treemap since it can't compare null value in order to perform sorting ascending
		
		System.out.println(treemap);
		
		
		System.out.println(treemap.descendingKeySet());// it will display in key values in descending order
		
		System.out.println(treemap.firstEntry()); // it will return the first entry(key & value) in  (ascending order) 
		System.out.println(treemap.firstKey()); // it will return the first key in ascending order
		System.out.println(treemap.floorEntry(5)); // it will return the Key (5) & values in entry 
		
		System.out.println(treemap.floorKey(12)); // it will return the respective key if its present in map if not it will return the max key available in map
	}

}
