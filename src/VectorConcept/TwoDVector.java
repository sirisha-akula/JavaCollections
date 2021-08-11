package VectorConcept;

import java.util.Vector;

public class TwoDVector {

	//How to create 2D Vector:
	public static void main(String[] args) {
		
		Vector<String> lang = new Vector<String>();
		lang.add("JAVA");
		lang.add("C#");
		lang.add("Ruby");
		lang.add("Phython");
		lang.add("JavaScript");
		System.out.println(lang);
		
		Vector osVector = new Vector();
		osVector.add(lang);//index =0
		
		for(int i =0 ; i<lang.size(); i++) {
			//String str = (string)((Vector)(osVector.get(0)).get(i);
			//System.out.println(str);
			
		}
		


	}

}
