package NumberTheory;

public class StrongNumber {

	public static void main(String[] args) {
	//n traversing 1 to 1000
		for (int n=1;n<1000;n++) {
			boolean sum=isstrong(n);
			if(sum) 
				System.out.print(n+"   ");
				
		}
		System.out.print("are strong number");
	}
	public static boolean isstrong(int n) {
		int  temp=n;
		int sum=0;
		while(n>0) {
			int b=n%10;
			int a=fact(b);
			sum=sum+a;
			n=n/10;	
		}
		return sum==temp;	
	}
	public static int fact(int n) {
		int fact=1;
		while (n>0) {
			fact=fact * n;
			n--;	
		}
		return fact;
	}
}
