package Collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//How many ways we can crate hashset object
		
		HashSet hs = new HashSet();//default capacity is 16 load factor is 0.75
		
	//	HashSet hs = new HashSet(100);//inital capacity is 100	
	//	HashSet hs = new HashSet(100, (float)0.90);
	
		//add objects/elements into hashset
		
		hs.add(100);
		hs.add(null);
		hs.add(true);
		hs.add(null);
		hs.add("1000.00f");
		
		System.out.println("HashSet :"+hs);	//[null, 1000.00f, 100, true] //insetion ordr is not preserved
		
		hs.remove("1000.00f");
		System.out.println(hs);	//[null, 100, true]
		//reading objects /elements from hashset using for.each loop
		
		for(Object e:hs) {
			System.out.println(e);
		}
		 
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//union , intersection , diffrence
		
		HashSet set1 =new HashSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(33);
		set1.add(44);
		set1.add(55);
		
		System.out.println("Set 1 :"+set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(11);
		set2.add(22);
		set2.add(33);
		set2.add(44);
		set2.add(55);
		System.out.println("Set 2 :"+set2);
		
		//set1.addAll(set2);
		//System.out.println("Union :"+set1);
		
		//Intersection
		
		//set1.retainAll(set2);
		
		//System.out.println("Intersection :"+set1);
		//Diffrence in set1 and set2
		
		set1.removeAll(set2);
		
		System.out.println("Difference :"+set1);
		
		
	}

}
