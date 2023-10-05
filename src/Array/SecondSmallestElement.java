package Array;

public class SecondSmallestElement {

	public static void main(String[] args) {

		int nums [] = TakeInput.takeInput();
		int a=secSmallest(nums,nums.length);
		System.out.println(a);
	}
	static int secSmallest(int arr[], int n)
	   {
	      int smallest = arr[0];
	      for (int i=0; i < n; i++){
	         if(arr[i] < smallest)
	            smallest = arr[i];
	      }
	     int sec_smallest = Integer.MAX_VALUE;

	     for (int i=0; i < n; i++){
	         if(arr[i] != smallest && arr[i] < sec_smallest)
	           sec_smallest = arr[i];
	     }
	    return sec_smallest;

	  }
	
	//Second method
//	static int secSmallest(int arr[], int n)
//	   {
//	        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
//
//	        for (int i=0; i < n; i++){
//	            if(arr[i] < first)
//	            { 
//	            	second = first; 
//	            	first = arr[i]; 
//	            } 
//	            else if(second>arr[i])
//	            	second = arr[i];
//	        }
//
//	        return second;
//
//	   }
}
