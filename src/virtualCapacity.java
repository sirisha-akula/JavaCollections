import java.util.ArrayList;

public class virtualCapacity {

	public static void main(String[] args) {

		//Bydefault virtual size of array is 10;
		ArrayList<Object> ar = new ArrayList<Object>(20);
		
		System.out.println(ar.size());
		
		ar.add(124); //physical size =0
		System.out.println(ar.size());
		
		ar.add(200); //pc =1
		ar.add(300); //pc =2
		
		System.out.println(ar.size());
		
	}

}
