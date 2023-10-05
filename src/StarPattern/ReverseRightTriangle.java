package StarPattern;

public class ReverseRightTriangle {

	public static void main(String[] args) {
		int n=6;
		int sp=0;
		
		for (int i = 1; i<=n ; i++) {
			for(int j=1 ;j <=sp;j++) {
				System.out.print("  ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
			sp++;
		}
		
	}

}
