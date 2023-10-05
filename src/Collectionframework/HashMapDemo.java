package Collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//HashMap m=new HashMap();
		
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(102, "Happy");
		
		System.out.println(m); //{101=John, 102=Happy, 103=Scott, 104=Mary, 105=Tye}
		
		
		System.out.println(m.get(104)); //Mary
		
		m.remove(105); //remove the entry from hash map
		System.out.println(m); //{101=John, 102=Happy, 103=Scott, 104=Mary}
		
		System.out.println(m.containsKey(101)); //true
		System.out.println(m.containsKey(105)); //false
		
		System.out.println(m.containsValue("Happy"));//true
		System.out.println(m.containsValue("Tye")); //false as we have removed entry
		
		System.out.println(m.keySet()); // will return all the keys as Set [101, 102, 103, 104]
		
		System.out.println(m.values());// will return all the values as a Collection [John, Happy, Scott, Mary]

		//to extract keys
		for (Object i:m.keySet()) {
			System.out.println(i);
		}
	

		//to extract values
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		//to extract key + values		
		for(Object i:m.keySet()) {
			System.out.println(i+"  "+m.get(i));//i will give key and get() method will give values
		}
		
		System.out.println("        ");
		// *************Entry methods********
		
		
		for(Map.Entry entry:m.entrySet())
		//entry variable is Map.Entry type and 
		{
			System.out.println(entry.getKey()+"    "+ entry.getValue());
		}
		
		
		
	}

}
