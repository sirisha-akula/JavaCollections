package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		
HashMap<String, Integer> compMap = new HashMap<String, Integer>();
compMap.put("Google", 2000);
compMap.put("Walmart", 6000);
compMap.put("Apple", 10000);
compMap.put("BestBuy", 4000);
compMap.put("Target", 20000);


System.out.println("List of companies: " + compMap.size());

//traversing through map using EntrySet
Iterator<Entry<String,Integer>> it = compMap.entrySet().iterator();
while(it.hasNext()) {
	Entry<String,Integer> entry = it.next();
	System.out.println("Key= " + entry.getKey()  + "Value= " + entry.getValue());
}


ArrayList<String> compname = new ArrayList<String>(compMap.keySet());
System.out.println("List of companies: " + compname.size());

for(String t : compname) {
	System.out.println(t);
}
	
	
List<Integer> noOfEmp = new ArrayList<Integer>(compMap.values());
System.out.println("List of companies: " + compname.size());

for(Integer i : noOfEmp) {
	System.out.println(i);
}

}
}