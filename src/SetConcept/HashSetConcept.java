package SetConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {
//HashSet does not allow duplicate values and atmost we can store null value.
//HashSet internally uses HashMap, it stores values in<k,V> format here key = Testing, value = PRESENT(value is constant)
	
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Testing");
		hs.add("JAVA");
		hs.add("Phython");
		hs.add("C#");
		hs.add("Ruby");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.contains("Ruby")); //it returs boolean value true
		
		//traversing
		for(String e : hs) {
			System.out.println(e);
		}
		
	Iterator<String> it =	hs.iterator();
	System.out.println(it.next());
	
	hs.remove("C#");
	System.out.println(hs);
	
	Boolean b1 = hs.contains("C#");
	System.out.println(b1);
	
	Set<Integer> first = new HashSet<Integer>(Arrays.asList(1,1,3,2,5,6,8,7,10,9,11));
	System.out.println(first);
	
	Set<Integer> second = new HashSet<Integer>(Arrays.asList(0,2,3,4,5,6,7,8,9,10));
	
	//get the union
	Set<Integer> union = new HashSet<Integer>(first);
	union.addAll(first);
	System.out.println(union);
	
	System.out.println("**************");
	
	//get the intersection which are common
	Set<Integer> intersection = new HashSet<Integer>(Arrays.asList(1,2,4,8,6));
	intersection.retainAll(second);
	System.out.println(intersection);
	
	//get the difference
		Set<Integer> differ = new HashSet<Integer>(Arrays.asList(9,15,4,8,3,0,12));
		differ.removeAll(second);
		System.out.println(differ);
		
	
	}


}
