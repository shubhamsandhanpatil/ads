package searching;

public class BinarySearch {

	public static int bSearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == target) {
				return mid;

			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };

		int target = 3;

		int result = bSearch(array, target);

		System.out.println(result);
	}

}
