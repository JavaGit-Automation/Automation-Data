package Array;

class Testarray {

	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum number in array is :- " + min);
	}

	static void max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number in array is :- " + max);
	}

}

public class Array3 {

	public static void main(String[] args) {

		int[] arr = { 34, 5, 9, 87, 4, 11, 201, 3, 222, 1, 3456, 0 };
		Testarray.min(arr);
		Testarray.max(arr);

	}

}
