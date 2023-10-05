package JavaRevision;

public class PositiveNegative {

	public static void main(String[] args) {

		int a=ReadNumber.TakeInput();
		boolean b= ispositive(a);
		if(b==true) {
			System.out.println(a +" is positive number");
		}
		System.out.println(a + " is negative number");
	}
	
	private static boolean ispositive(int a) {
		if(a>1) {
			return true;
		}
		return false;
	}
}
