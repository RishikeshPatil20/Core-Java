package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=scanner.nextLine();
		System.out.println("Enter the second string");

		String str2=scanner.nextLine();
		boolean status=AnagramString1(str1, str2);
		if(status) {
			System.out.println("String is anagram");	
		}
		else
			System.out.println("Stirng is not anagram");
		
		scanner.close();
		
	}
	public static boolean AnagramString1(String str1, String str2) {
		String s1=str1.replaceAll("\\s","");
		String s2=str2.replaceAll("\\s","");
		boolean status=true;
		if(s1.length() != s2.length()) {
			status= false;
		}
		else {
			char[] a=s1.toLowerCase().toCharArray();
			char[] b=s2.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			status=Arrays.equals(a, b);
		}
		return status;
		
		
	}

}
