package ArrayAssignment;

public class ArrayDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 4, 1, 5,6, 2 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count = count + 1;
				}
			}
			if (count != 0) {
				System.out.println("Duplicate Element:- " + arr[i]);
			}

		}

	}

}
