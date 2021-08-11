import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

ArrayList<String> ar1 = new ArrayList<String>();
ar1.add(("JAVA"));
ar1.add(("Phyton"));
ar1.add(("php"));
ar1.add((".net"));

ArrayList<String> ar2 = new ArrayList<String>();
ar2.add("testing");
ar2.add("Selenium");
System.out.println(ar1);


//ar2.addAll(ar1);
//System.out.println(ar2);

//ar2.addAll(2, ar1);
//System.out.println(ar2);

//ar1.clear();
//System.out.println(ar1);

ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
System.out.println(cloneList);


System.out.println(cloneList.contains("JAVA")); //contains return boolean value, if specified element exists returns true else false.
System.out.println(cloneList.contains("C#"));


System.out.println(cloneList.indexOf("php")>0);

ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("arjun", "kittu", "prani", "vishnu", "siri"));
System.out.println(arrayList);

int i  = arrayList.lastIndexOf("vishnu");
System.out.println(i);

arrayList.remove("siri");
System.out.println(arrayList);

ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
System.out.println(num);
num.removeIf(n -> n%2 == 0);
System.out.println(num);

ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
num1.removeIf(n -> n%2 != 0);
System.out.println(num1);


ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Arjun", "padu", "kittu", "vishnu"));
System.out.println(namesList);
namesList.retainAll(Collections.singleton("padu"));
System.out.println(namesList);

ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 7));
System.out.println(subList);


ArrayList<String> colors =  new ArrayList<String>(Arrays.asList("Red", "Orange", "blue","pink"));
Object arr[] = colors.toArray();
//System.out.println(Arrays.toString(arr));

for(Object o : arr) {
	System.out.println((o));
}

	}

}
