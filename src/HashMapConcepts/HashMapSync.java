package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		//SynchronizedMap  method in Collections class
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("Red", "Rose");
		map1.put("Lotus", "pink");
		map1.put("sunflower", "yellow");
		
		//Creating SynchronizedMap
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//ConcurrentHashMap --it does not throw ConcurrentModification Exception bcoz it allows multi threading
		Map<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		concurrentMap.put("Apple", "Red");
		concurrentMap.put("Avacado", "Green");
		System.out.println(concurrentMap.get("Avacado"));
		
		
	}

}
