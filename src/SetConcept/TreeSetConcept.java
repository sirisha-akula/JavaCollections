package SetConcept;
import java.util.TreeSet;

//TreeSet : sorts the elements in ascending order.
public class TreeSetConcept {
	
	public static void main(String[] sargs) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
        
        System.out.println(tset);
        
        for(String s : tset) {
        	System.out.println(s);
        }

		
 		
	}

}
