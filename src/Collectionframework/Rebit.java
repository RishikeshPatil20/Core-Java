package Collectionframework;

import java.util.Scanner;

public class Rebit {
	public static void main(String[] args) {
		String str = "Ramesh";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		//prime number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		//a=11	
		boolean b=isprime(a);
		System.out.println(b);
	}
	static boolean isprime(int a) 
	{
		if(a<=1) 
			return false;		
		for (int i = 2; i<a/2 ; i++) { 
			if(a%i==0) 
				return false;
			
		}
		return true;
	}		
	}

