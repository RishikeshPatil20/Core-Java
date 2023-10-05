package NumberTheory;

import java.util.Scanner;

public class DiscriumNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		boolean dn=DiscriumNumber(a);
		if(dn==true) {
			System.out.println(a+" is a discrium number");
		}
		else {
			System.out.println(a+" is not a discrium number");
		}
		
	}
	public static boolean DiscriumNumber(int n) {
		int sum=0,temp=n;
		int a=count(n);
		
		while(n>0) {
		int r=n%10;
		int p=power(r,a);
		sum=sum+p;
		n=n/10;
		a--;
		}
		if(sum==temp) {
			return true;
		}
			return false;
	}
	public static int power(int n,int p) {
		int pow=1;
		while(p>0) {
			pow=pow*n;
			p--;
		}
		System.out.println(pow);
		return pow;
		
	}
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;		
	}

}
