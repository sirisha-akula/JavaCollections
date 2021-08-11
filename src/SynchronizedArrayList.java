import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

	//1. Collections.synchronizedList
	List<String> names	=  Collections.synchronizedList(new ArrayList<String>());
	names.add("kittu");
	names.add("padu");
	names.add("arjun");

	//add, remove - we dont need explicit synchronization
	//to fetch/traverse  the values from list - we need explicit synchronization
	
	synchronized (names) {
	Iterator<String> it	= names.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}
	
	//2. copyOnWriteArrayList --it is class 
	
	CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
	empList.add("Tom");
	empList.add("Steve");
	empList.add("Peter");
	
Iterator<String> it	= empList.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	
	}

}
