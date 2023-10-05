package NumberTheory;

import java.util.Iterator;

public class XylemNumber {

	public static void main(String[] args) {
		int a=121;
		boolean x=Xylem(a);
		if(x) {
			System.out.println(a+" the number is xylem");
		}
		else {
			System.out.println(a+"is not a xylem number");
		}

	}
	public static boolean Xylem(int n) {
		int sum=0;
		int temp=n%10;
		n=n/10;
		while(n>9) {
			int mean=n%10;
			sum = sum+mean;
			n=n/10;
		}
		int extreamSum=temp+n;
		return extreamSum==sum;
		
	}

}
