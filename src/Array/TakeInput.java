package Array;

import java.util.Scanner;

public class TakeInput {

	

		public static int[] takeInput(){
			Scanner  sc= new Scanner(System.in);
			
			System.out.println("Enter length of an array");
			int n = sc.nextInt();
			
			int [] array =new int[n];
			
			System.out.println("Enter the elements in an array");
			for(int i=0;i<array.length;i++) {
				array[i]=sc.nextInt();
			}
			return array;
		}
	}


