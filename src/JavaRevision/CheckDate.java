package JavaRevision;

public class CheckDate {

	public static void main(String[] args) {
		int day = 5;
		int month = 10;
		int year = 2023;

		boolean valid = isValidDate(day, month, year);
		if (valid) {
			System.out.println("Date is valid.");
		} else {
			System.out.println("Date is not valid.");
		}
	}

	public static boolean isValidDate(int d, int m, int y) {
		if (y < 1 || m < 1 || m > 12) {
			System.out.println("Invalid Date");
			return false;
		} else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d < 1 || d > 30)) {
			System.out.println("Invalid Date");
			return false;
		} else if (m == 2) {
			if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
				if (d < 1 || d > 29) {
					System.out.println("Invalid Date");
					return false;
				}
			} else {
				if (d < 1 || d > 28) {
					System.out.println("Invalid Date");
					return false;
				}
			}
		} else if (d < 1 || d > 31) {
			System.out.println("Invalid Date");
			return false;
		}
		System.out.println("Valid Date");
		return true;
	}

}
