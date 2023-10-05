package Strings;

import java.util.Scanner;

public class FreqCharOfString {
//Find frequency of characters in a string
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string here : ");
		String str=scanner.nextLine();
		int [] freq=new int[str.length()];
		int i,j;
		//converting string to char
		char[]string=str.toCharArray();
		for(i=0;i<str.length();i++) {
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				if(string[i]==string[j]) {
					freq[i]++;
				string[j]='0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies"); 
	    for(i = 0; i <freq.length; i++) { 
	        if(string[i] != ' ' && string[i] != '0') 
	           System.out.println(string[i] + "-" + freq[i]); 
	        }
	}

}
