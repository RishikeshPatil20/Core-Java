package NumberTheory;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean a=amstrong(n);
		if(a==true) {
			System.out.println(n+" is amstrong");
		}
		else
			System.out.println(n+" is not amstrong");
		
	}
	public static boolean amstrong(int n) {
		int sum=0,temp=n;
		int a=count(n);
		
		while(n>0) {
		int r=n%10;
		int p=power(r,a);
		sum=sum+p;
		n=n/10;
		}
		if(sum==temp) {
			return true;
		}
			return false;
	}
	public static int power(int n,int a) {
		int pow=1;
		
		while(a>0) {
			pow=pow*n;
			a--;	
		}
		return pow;
	}
	public static int count(int n) {
		int count=0;
		while (n>0) {
			count++;
			n=n/10;
		}
		return count;
	}		
}

