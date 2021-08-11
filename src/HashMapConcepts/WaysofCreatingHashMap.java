package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysofCreatingHashMap {
	
	public static Map<String, String> maplist;
	
	static {
		
		maplist = new HashMap<>();
		maplist.put("Cow", "calf");
		maplist.put("Dog", "Puppy");
		
		
	}

	public static void main(String[] args) {
		
		//1.Using Hashmap Class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>(); //top casting
		
		//2.static way: static hashmap:
		System.out.println(WaysofCreatingHashMap.maplist.get("Dog"));
		
		//3.Immutablemap with only one Single entry
		Map<String, Integer> map3 = Collections.singletonMap("Rose", 100);
		System.out.println(map3.get("Rose"));
		//map3.put("lotus", 900); //unsupportedException as it allows only single entry
		
		
		//4. From JDK 1.8
		//Creating 2D array of String using Stream and collecting in the form of map
		
		Map<String, String> map4 = Stream.of(new String [][]{
				{"Tom", "A Grade"},
		{"Arjun", "A++Grade"	},	
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Rose","B grade");
		System.out.println(map4.get("Rose"));
		
		//using simple entry : Immutable map-- it means we cannot add more values.
		
		Map<String, String> map6 = Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("Naveen" , "java"),
				new AbstractMap.SimpleImmutableEntry<>("harry" , "selenium")
				
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
		System.out.println(map6.get("harry"));
		map4.put("Rose","B grade");
		System.out.println(map6.get("Rose"));
		
		//jdk 1.9
		//empty map
		//Map<String, String> emptymap = Map.of();
		//emptymap.put("Tom", "C");
		//System.out.println(emptymap.get("Tom"));// UnsupportEdexception--as it is empty map it doesnot allow values
		
		//SingletonMap
		//Map<String, String> singletonmap = Map.of("K1" ,"V1");
		//System.out.println(singletonmap.get("k1"));
		//singletonmap.put("k2", "v2");//UnsupportedException--as it is singletonmap it allows only one value
		
		//MultiValues Map :max 10 pairs can be stored
	    //Map<String, String> multipleValues = Map.of("K1" ,"V1","K2" ,"V2","K3" ,"V3");
	    //System.out.println(singletonmap.get("k2"));
		
		
		/*ofEntries method: no limitation on paris(key-Value)
		Map<String, Integer> map7 = Map.ofEntries(
		               newAbstractMap.SimpleEntry<>("A", 100),
		               newAbstractMap.SimpleEntry<>("B", 200),
		               newAbstractMap.SimpleEntry<>("C", 300)
		               );

		               System.out.println(map7.get("C")); */	
		
	}

}
