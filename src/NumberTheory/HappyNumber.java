package NumberTheory;

public class HappyNumber {

	public static void main(String[] args) {
		int b=20;
		boolean check=HappyNumber(b);
		if(check==true) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}
	public static boolean HappyNumber(int a) {
		while(a>9) {
			a=SquareDigit(a);
		}
		return a==1 || a==7;
	}
	public static int SquareDigit(int n) {
		int sum = 0;
		//49 9*9=81+16
		while(n>0) {
			int number=n%10;
			sum=sum + number*number;
			n=n/10;
		}
		return sum;
	}

}
