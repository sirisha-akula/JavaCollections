package HashMapConcepts;

import java.util.HashMap;

public class HashMapWorks {

	//how hashmap works internally?
	//it works based on hashcode -->hashing
	//hashmap stores internally 4 items (hascode, key, value, hashcode next) bydefault 16 nodes/bucket will be there.
	//at first hascode is calucated n based on it index is generated, then key, value are stored in that particular index.
	//hashmap collison: if there is same hascode is calculated for multiple values it stores at same index in linked list
	//format and after 8 values it stores in balanced tree format
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Kittu",  400);
		marks.put("Arjun",  100);
		marks.put("vishnu",  500);
		marks.put("harry",  300);
		marks.put("prani",  200);
		
		marks.put(null, 200); //for null key it stores at index 0
		marks.put("garry", null);
		
		System.out.println(marks.get("harry"));
		//first hascode of harry is caluclated--201678
		//index = 15
		//.equals check the key name harry and return the value.
		

	}

}
