package StarPattern;

public class StarPattern1 {

	public static void main(String[] args) {
		int n = 7;
		int st=n/2+1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <=st ; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				st--;
			}
				
			else {
				st++;
			}

		}
		
	}

}
