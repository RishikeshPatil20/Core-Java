package Collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class Set {

	public static void main(String[] args) {

		LinkedHashSet<String> set
        = new LinkedHashSet<String>();		
		set.add("abc");
		set.add("Index 1");
		set.add("main 2");
		set.add("main 2");//duplicate elements are not allowed
		set.add(null);
		set.add(null);
		set.add("Index 3");
		
		for(Object a : set) {
			System.out.println(set);
		}
		
		
	}

}
