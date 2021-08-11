package SetConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	//it is not synchronized
	//its high performance java collection memeber
	//faster than HashSet
	//all the methods are implemented using bitwise arithmetic operations
	
	enum Lang{
		JAVA, CSHARP, RUBY, PHYTHON, JAVASCRIPT }
	
	
	public static void main(String[] args) {
		
		//Created new enumset using  enum
		EnumSet<Lang> lang = EnumSet.allOf(Lang.class);
		System.out.println(lang);
		
		
	//empty enumset
	EnumSet<Lang> emptyenumSet = EnumSet.noneOf(Lang.class);
	System.out.println(emptyenumSet);
	
	//Range enumset
	EnumSet<Lang> rangeSet =EnumSet.range(Lang.JAVA, Lang.PHYTHON);
	System.out.println(rangeSet);
	
	//of
	EnumSet<Lang> singleSet = EnumSet.of(Lang.CSHARP);
	System.out.println(singleSet);
	
	//multiple
	EnumSet<Lang> multipleset = EnumSet.of(Lang.PHYTHON, Lang.RUBY);
	System.out.println(multipleset);
	
	//and and andALL()
	EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
	EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
	
	lang2.add(Lang.PHYTHON);
	System.out.println(lang2);
	
	lang2.addAll(lang1);
	System.out.println(lang2);
	
	//traverse
	Iterator<Lang> it = lang2.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//remove and removeAll()
	EnumSet<Lang> lang3 = EnumSet.allOf(Lang.class);
	Boolean b = lang3.remove(Lang.CSHARP); //remove method gives boolean value true or false
	System.out.println(b);
	
	Boolean b1 = lang3.removeAll(lang3); ////removeAll method gives boolean value true or false
	System.out.println(b1);
	
	
	}

}
