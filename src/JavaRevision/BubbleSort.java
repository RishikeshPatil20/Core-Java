package JavaRevision;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of an array : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int[] sortedarr = bubblesort(arr);
		for (int i = 0; i < sortedarr.length; i++) {
			System.out.println(sortedarr[i]);
		}
		scanner.close();
	}

	public static int[] bubblesort(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
