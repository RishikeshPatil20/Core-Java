package JavaRevision;

import java.util.Arrays;

public class ReplaceByRankInArray {

	public static void main(String[] args) {

		int[] arr = { 100, 2, 70, 12 , 90};
		
		changeArr(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void changeArr(int[]arr) {
		//copy the input array
		int [] newarray=Arrays.copyOfRange(arr, 0, arr.length);
		
		//sort the array
		Arrays.sort(newarray);
		for(int i=0;i<newarray.length;i++) {
			for (int j = 0; j < newarray.length; j++) {
				if(newarray[j]==arr[i]) {
					arr[i]=j+1;
					break;
			}
		}
	}
	

}
}
