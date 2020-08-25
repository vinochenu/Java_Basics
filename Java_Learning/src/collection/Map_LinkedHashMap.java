package collection;

import java.util.LinkedHashMap;

public class Map_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		
		// here it will follow insertion order
		
		linkedhashmap.put(null, "bicycle");
		linkedhashmap.put(1, "bus");
		linkedhashmap.put(2, "car");
		linkedhashmap.put(3, "auto");
		linkedhashmap.put(null, "cycle");
		
		System.out.println(linkedhashmap);
		
		System.out.println(linkedhashmap.keySet());// it will return all keys in the map 
		
		
		System.out.println(linkedhashmap.values());
	}

}
