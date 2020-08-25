package collection;

import java.util.HashMap;

public class Map_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hashmap=new HashMap<String,String>();
		
		// here it wont follow insertion order & it works on based of hashcode
		
		hashmap.put("Browser", "Chrome");//when key & value pair stored in map, we called one entry 
		hashmap.put("driver", "WebDriver");
		hashmap.put("Tool", "Selenium");
		hashmap.put("framework", "POM");
		
		System.out.println(hashmap);
		
		hashmap.put("framework", "DATADRIVEN"); // value will over ride if duplicate key is added
		System.out.println(hashmap);
		
		hashmap.put(null, "XXX"); // null key will added in map
		System.out.println(hashmap);
		
		hashmap.put(null, "YYY");// when duplicate null key is added, value will be override
		System.out.println(hashmap);
		
		
		System.out.println(hashmap.containsKey("driver")); //it will return boolean if key is present in map
		
		System.out.println(hashmap.containsValue("Selenium")); // it will return boolean if value is not present in map
		
		hashmap.replace("Browser", "Firefox"); // it will replace the value under the mentioned key
		System.out.println(hashmap);
		
		System.out.println(hashmap.entrySet());// it will return the same element in map in SET view
		
		
		
		
		
		
	}

}
