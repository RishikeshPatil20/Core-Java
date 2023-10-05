package Collectionframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		//inserting values 
		l.add(100);
		l.add(200);
		l.add(250);
		l.addAll(l);
		System.out.println(l);
		
		System.out.println(l.get(3));
		
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(i + " " + l.get(i));
//			
//		}
//		for(Object e : l) {
//			System.out.println(e);
//		}
		
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() );
		}
		
//		System.out.println("Before Sorting :"+l);
//		//sorting order 
//		Collections.sort(l);
//		
//		System.out.println("After  Sorting :"+l);
//		
//		//reverse order
//		Collections.sort(l,Collections.reverseOrder());
//		
//		System.out.println("Reverse Order  :" + l);
//		//shuffling 
//		
//		Collections.shuffle(l);
//		System.out.println("Shuffle Order  :"+l);
		
	}

	}


