package Array;
import java.util.Arrays;
import java.util.Iterator;


public class FrequencyOfAnArray {

	public static void main(String[] args) {

		int[] arr=TakeInput.takeInput();
		int n= arr.length;
		boolean b[] = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			if(b[i]==false) {
				int count =1;
				for (int j =i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(arr[i] +" count : "+ count );
			}
		}
	}

}
