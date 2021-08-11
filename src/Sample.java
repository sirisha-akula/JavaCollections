import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(002, "tom");
		hm.put(001, "rob");
		hm.put(003, "bob");
		
		System.out.println(hm.get(001)); //get value based on key
		
		 //iterator over the keys using keySet()
	Iterator it =	hm.keySet().iterator();
	while(it.hasNext()) {
		Integer key = (Integer) it.next();
		String value = hm.get(key);
		System.out.println("key ="+ key + "value =" +value);
	}
	
	 //iterator over the pair using entrySet()
	
	Iterator it1= hm.entrySet().iterator();
	while(it1.hasNext()) {
		Entry entry = (Entry) it1.next();
		System.out.println("key = "+entry.getKey() + "value = " + entry.getValue());
	}
	
		
	}

}
