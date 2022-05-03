package ArrayAssignment;

public class ArrayRightRotare {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int rightRoated = 3;
		int[] temp = new int[arr.length];
		System.out.println("***Elements Of Array before rotate***");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nElements after Right rotate from position: "+rightRoated);
		for (int i = 0; i < arr.length; i++) {

			temp[i] = arr[arr.length-rightRoated];
			System.out.print(temp[i] + " ");
			rightRoated = rightRoated - 1;

			if (rightRoated == 0) {
				rightRoated = arr.length;
			}

		}

	}

}
