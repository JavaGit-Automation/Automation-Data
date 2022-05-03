package ArrayAssignment;

public class ArrayRemoveDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 1, 5,5, 4, 2, 3, 4,6, 4, 7, 6 };
		int temp[] = new int[arr.length];
		System.out.println("***Elements Of Array ***");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int remElement = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					temp[j] = remElement;
			}

		}
		System.out.println("\nElements of an array after removing duplicate");
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] != remElement)
				System.out.print(arr[i] + " ");
		}
	}
}
