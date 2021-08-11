import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {

		//1. sort and then equals:
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C","E","D"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C","F","D"));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C","F","D"));

		
		Collections.sort(l1);
		Collections.sort(l2);
        System.out.println(l1.equals(l2)); //it gives false
        
        Collections.sort(l3); //first sort and then compare it  gives true now
        System.out.println(l2.equals(l3)); //true

        //2.Compare two arraylist -- give additional elements
        
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C","E","D"));
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C","F","D"));

		//l4.removeAll(l5);
		//System.out.println(l4);
		
		//3.Find out missing element
		l5.removeAll(l4);
		System.out.println(l5);
		
		
		//4.Find out commom elements in two ArrayList
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "phython", "C#","JS","C"));
		
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Ruby", "phython", "C#","JAVA","C"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		

		

	}

}
