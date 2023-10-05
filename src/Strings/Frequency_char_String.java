package Strings;

import java.util.Scanner;

public class Frequency_char_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String"); 
		String str=sc.nextLine();
		
		//i am a boy 
		int freq=0;

		char[] string=str.toCharArray();
		for (int i = 0; i < string.length; i++) {
			freq=1;
			for (int j = i+1; j < string.length; j++) {
				if(string[i]==string[j]) {
					freq++;
					//avoid printing visited char
					string[j]=0;
				}
			}
		}
		for (int i = 0; i < string.length; i++) {
			if(string[i]!=0 && string[i]!=' ') {
				System.out.println("the frequency of "+string[i]+" is"+freq);
			}
		}
		
	}

}
