import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Tom");
		ar.add("PEter");
		ar.add("Arjun");
		ar.add("kittu");
		
		//typical for loop
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("***********");
		
		//for each loop
		for(String s : ar) {
			System.out.println(s);
		}
		System.out.println("***********");

		
		//iterator
	Iterator<String> it	= ar.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("***********");

	
	//from jdk 8 version stream with lamda 
		ar.stream() //Creating stream
		.filter(n ->n.startsWith("k")) ///filtering names that starts with k 
		.forEach(System.out::println); //displaying the stream using forEach
		
		System.out.println("***********");
		
		//lambda exp with if condition:
		ar.forEach(ele -> {	if("Tom".equals(ele)) {
			System.out.println(ele);}
		});
		
	}

}
