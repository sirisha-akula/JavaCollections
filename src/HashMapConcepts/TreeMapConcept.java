package HashMapConcepts;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

//TreeMap: maintains the sorting order based on the keyset.
public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();
		map1.put(1000, "Arjun");
		map1.put(10000, "prani");
		map1.put(5000, "vishnu");
		map1.put(400, "padu");
		map1.put(2000, "kittu");
		System.out.println(map1);
		
	Iterator<Entry<Integer,String>> it	= map1.entrySet().iterator();
	while(it.hasNext()) {
		Entry<Integer,String> entry = it.next();
		System.out.println("Key = " +entry.getKey() + "Value =" +entry.getValue() );
	}
	
	TreeMap<String,Integer> map2 = new TreeMap<String,Integer>(Comparator.reverseOrder());
	map2.put("James", 100);
	map2.put("Brad", 200);
	map2.put("Albert", 400);
	map2.put("George", 50);
	map2.put("Larry",900);
	map2.put("Ted",120);
	map2.put("Paul",300);
	System.out.println(map2);
	
	Iterator<Entry<String, Integer>> it1 = map2.entrySet().iterator();
	while(it.hasNext()) {
		Entry<String, Integer> entry1 = it1.next();
		System.out.println("Key = "+ entry1.getKey() + "Value =" + entry1.getValue());
	}
	}

}
