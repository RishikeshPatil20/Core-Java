package Array;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]=TakeInput.takeInput();
		int sumArr=0;
		
		for(int i=0;i<a.length;i++) {
			sumArr  =sumArr + a[i];
		}
		int n=a.length;
		int expSum =(n*(n+1)/2);
		int reqSum =expSum -sumArr;
		
		System.out.println(reqSum);
	}
}
