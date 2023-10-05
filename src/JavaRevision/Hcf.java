package JavaRevision;

public class Hcf {

	public static void main(String[] args) {
		int num1=ReadNumber.TakeInput();
		int num2=ReadNumber.TakeInput();
		
		int hcf=getHCF(num1,num2);
		System.out.println(hcf);
	}

	static int getHCF(int a, int b) {

		return b == 0 ? b : getHCF(b , a % b );
	}

}
