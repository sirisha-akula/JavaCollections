import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
 
		ArrayList<Integer> ar = new ArrayList<Integer>(); //Integer arraylist
		ar.add(100);
		ar.add(200);
		
		ArrayList<Double> ar1  = new ArrayList<Double>(); //double arraylist
		ar1.add(10.34);
		
		ArrayList<String>  ar2 = new ArrayList<String>(); //string arraylist
		ar2.add("Tom");
		ar2.add("pap");
		
		
		ArrayList<Object> obj = new ArrayList<Object>(); //Object arraylist
		obj.add(45.76);
		obj.add('u');
		
 	}

}
