package SetConcept;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* HashSet: doesn’t maintain any kind of order of its elements.
TreeSet : sorts the elements in ascending order.
LinkedHashSet : maintains the insertion order.
Elements gets sorted in the same sequence in which they have been added to the Set.*/
//Both HashSet and TreeSet does not hold duplicate elements, which means both of these are duplicate free.

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("Red");
		lhs.add("Orange");
		lhs.add("Yellow");
		lhs.add("Green");
		lhs.add("Pink");
		lhs.add("White");
//		lhs.add("Violet");
//		
//		for(String s : lhs) {
//			System.out.println(s);
//		}
//	Iterator<String> it	= lhs.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
		
	List<String> result =lhs.stream().filter(x->x.startsWith("O")).collect(Collectors.toList());
	System.out.println(result);
		//lambda exp:
	//lhs.forEach(ele -> System.out.println(ele));
	}

}
