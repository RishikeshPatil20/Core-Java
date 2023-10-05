package Collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

//				ArrayList al =new ArrayList();
//				al.add(100);
//				al.add("Made me happy");
//				al.add(500);
//				al.add(al.size());
//				System.out.println("Array List is as follows : "+ al);
//				
//				al.set(0, 250);
//				System.out.println("Updated array list : "+al);
//				
//				System.out.println(al);
//				System.out.println(al.get(2));
//				al.addAll(al);
//				System.out.println(al);
//				System.out.println(al.get(4));
				
				
				ArrayList bl =new ArrayList();
				bl.add(5000);
				bl.add(5);
				bl.add(10);
				bl.sort(null);
			
				//iterating over ArrayList
				for (int i = 0; i < bl.size(); i++) {
					System.out.println(i + "  " + bl.get(i));
				}
				
				
				
			}

		
	}


