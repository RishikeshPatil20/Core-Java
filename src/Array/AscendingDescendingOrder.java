package Array;

public class AscendingDescendingOrder {

	public static void main(String[] args) {

		int a []=TakeInput.takeInput();
		int n = a.length;
		System.out.print("Input :");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println("");
		System.out.print("Half Ascending and Half Descending order of array is : ");
		int temp;
	     for(int i=0;i < n-1;i++)
	     {
	        for(int j = 0;j < n/2; j++) { 
	        	if(a[j]>a[j+1])
	            {
	              temp=a[j];
	              a[j]=a[j+1];
	              a[j+1]=temp;
	            }
	        }

	        for(int j = n/2;j < n-1; j++)
	        {
	            if(a[j] < a[j+1])
	            {
	               temp=a[j];
	               a[j]=a[j+1];
	               a[j+1]=temp;
	            }
	         }
	      }
	      for(int i = 0; i < n; i++)
	         System.out.print(a[i] + " ");

	   }
}
