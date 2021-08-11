import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers =  new ArrayList<Integer>(Arrays.asList(1,2,1,3,3,3,4,5,1,5,4,7,3,7,8,8,9,1,4));
		
		//1. linkedHashSet
		
		LinkedHashSet<Integer> numberList = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListwithoutDuplicate = new ArrayList<Integer>(numberList);
		System.out.println(numbersListwithoutDuplicate);
		
		//2. JDK 8 --Streams
		ArrayList<Integer> marksList =  new ArrayList<Integer>(Arrays.asList(1,2,1,3,3,3,4,5,1,5,4,7,3,7,8,8,9,1,4));
	    List<Integer> marksListUnique	= marksList.stream().distinct().collect(Collectors.toList());
	    System.out.println(marksListUnique);

	}

}
