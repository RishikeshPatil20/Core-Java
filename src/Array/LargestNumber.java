package Array;

public class LargestNumber {

	public static void main(String[] args) {

		int a[]=TakeInput.takeInput();
//		int max =Integer.MIN_VALUE;
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}

}
