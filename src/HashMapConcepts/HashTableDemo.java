package HashMapConcepts;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	//Hashtable is legacy ie. in jdk 1.1 it is introduced".
	//hashtable does not allow null key and null values. 
	//In hashtable there will be 11 segements available based on hasing method hashcode is calculated and index is generated.
	//in case of collision it stores in linkedlist format.

	public static void main(String[] args) {
		Map<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("Arjun", 100);
		hashtable.put("Harry", 300);
		hashtable.put("kittu", 400);
		hashtable.put("vishnu", 700);
		hashtable.put("ramu", 200);
		hashtable.put("prani", 10);
		
		System.out.println(hashtable.get("ramu"));
		System.out.println(hashtable.get("vishnu"));
		System.out.println(hashtable.get("Harry"));
		

	}

}
