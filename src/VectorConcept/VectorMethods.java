package VectorConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
Vector<Integer> myVector = new Vector<Integer>();
myVector.add(10);
myVector.add(16);
myVector.add(4);
myVector.add(96);
myVector.add(34);
myVector.add(11);
myVector.add(21);
myVector.add(47);
System.out.println(myVector);

System.out.println(myVector.get(5));

myVector.remove(3);
System.out.println(myVector);

Vector<Integer> urVector = new Vector<Integer>();
urVector.add(23);
urVector.add(46);
System.out.println(urVector);


urVector.addAll(myVector);
System.out.println(urVector);

Collections.sort(urVector);
System.out.println(urVector);


for(int p=0 ;p<urVector.size(); p++) {
	System.out.println(urVector.get(p));
	
}

for(Integer e : urVector) {
	System.out.println(e);
	
}

Iterator<Integer> itr = urVector.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
