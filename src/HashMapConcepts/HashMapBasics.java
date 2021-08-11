package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		//no order -- no indexing 
		//stores value -- 	key value <k,v>
		//key cannot be duplicate
		//can store n number null values but only one null key
		//hashmap is not synchronized
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India","New Delhi");
		capitalMap.put("USA","Washington DC");
		capitalMap.put("Canada", "Ontario");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London1");
		capitalMap.put(null, "Paris");
		capitalMap.put(null, "LA");

		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");
		
		System.out.println(capitalMap.get("Canada"));
		System.out.println(capitalMap.get("UK")); //it will not give error but gives overriden value :london1
		System.out.println(capitalMap.get(null)); //it will not give error but gives overriden value :LA
        System.out.println(capitalMap.get("France"));
        
   //iterator over the keys using keySet()
   Iterator<String> it   = capitalMap.keySet().iterator();
   while(it.hasNext()) {
	String key  =  it.next();
	String value = capitalMap.get(key);
	System.out.println("Key = " + key + "value = " + value);
   }
       
   System.out.println("****************");
   
 //iterator over the set(pair0 using entrySet()
    Iterator<Entry<String, String>> it1  = capitalMap.entrySet().iterator();
    while(it1.hasNext()) {
	 Entry<String, String> entry = it1.next();
	 System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
 }

 System.out.println("**********************");
 
//iterate hasmap using foreach and lambda in JAVA 8:
 capitalMap.forEach((k,v) -> System.out.println("key = " + k + "value = " + v));  
 capitalMap.forEach((k,v) -> System.out.println("key = " + k + "value = " + v));
        
	}

}
