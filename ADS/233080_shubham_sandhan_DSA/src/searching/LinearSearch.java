package searching;

import java.util.Scanner;

public class LinearSearch {

	public static int Lsearch(int data, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { 21, 9, 5, 7, 4, 1 };
		System.out.println("enter the num to search");
		int target = sc.nextInt();

		int result = Lsearch(target, array);
		System.out.println(result);

		if (result != -1) {
			System.out.println("num found in array");
		} else {
			System.out.println("num is not found in array");
		}
	}

}