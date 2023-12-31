package sorting;

public class Bubble_sort {
	public static int bubbleSort(int[] arr) {

		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 25, 50, 11, 15, 75, 35, 8, 5, 2 };

		System.out.println("Array before sorting..");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("     ");
		System.out.println("Array after sorting...");
		bubbleSort(array);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}