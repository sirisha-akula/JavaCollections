package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
	//LL is default class in java
	//it can be used as List, stack, queue
	//it allows null entry
	//dynamic collection- hence insertion and deletion can be easily implemented
	//it contians duplicate elements
	//it is not thread - not Synchronized
	//in ll manipulation is fast because we dont need to shift anything

	//ll constructors:
	//LinkedList();
	//LinkedList(Collections c);
	
	public static void main(String[] args) {
		
LinkedList<String> names = new LinkedList<String>();
names.add("Arjun");
names.add("kittu");
names.add("udit");
System.out.println(names.size());
System.out.println(names.get(2));

Iterator<String> it = names.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

for(String e : names) {
	System.out.println(e);
}

names.add(1, "laddu");
System.out.println(names);

LinkedList<String> users = new LinkedList<String>();
users.add("Sonu");
users.add("Billu");

names.addAll(users);
System.out.println(names);


names.addFirst("Ravi");
names.addLast("Shivan");
System.out.println(names);

names.remove(2);
System.out.println(names);

names.removeAll(users);
System.out.println(names);

names.clear();
System.out.println(names);

LinkedList<String> colors = new LinkedList<String>();
colors.add("red");
colors.add("blue");
colors.add("white");
colors.add("grey");
colors.add("pink");

//to print list in descending order
Iterator<String> itr = colors.descendingIterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

Collections.sort(colors);
System.out.println(colors);

 	}

}
