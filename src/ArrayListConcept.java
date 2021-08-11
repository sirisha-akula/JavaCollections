import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//ArrayList is a default class
		//dynamic array
		
		//default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("Tom"); //0 it stores in order/ indexing format
		ar.add("126.77"); //1
		ar.add(123); //2
		ar.add(true);//3
		ar.add('Y'); //4
		System.out.println(ar);

		//to get size of array
		System.out.println(ar.size());
		System.out.println("LI = " +0);
		System.out.println("HI = " +(ar.size()-1));

		ar.add(30);
		ar.add(40);
		
		System.out.println(ar.get(2)); //get is the method to get array values
		System.out.println(ar.get(-1)); //negative indexing is not allowed in java
		
	}

}
