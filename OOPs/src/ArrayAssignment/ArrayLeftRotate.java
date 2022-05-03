package ArrayAssignment;

public class ArrayLeftRotate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int leftRoated = 5;
		int[] temp = new int[arr.length];
		System.out.println("***Elements Of Array before***");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nElements after Left rotate from position: "+leftRoated);
		for (int i = 0; i < arr.length; i++) {

			temp[i] = arr[leftRoated];
			System.out.print(temp[i] + " ");
			leftRoated = leftRoated + 1;

			if (leftRoated == arr.length) {
				leftRoated = 0;
			}

		}

	}
}
