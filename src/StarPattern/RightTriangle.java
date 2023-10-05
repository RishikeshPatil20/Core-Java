package StarPattern;

public class RightTriangle {

	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++) {
//				System.out.print("*");
//				System.out.print(j+"");
//				System.out.print(sp+"");
				System.out.print(i+"");
			}
			sp--;
			System.out.println();
		}
		
	}

}
