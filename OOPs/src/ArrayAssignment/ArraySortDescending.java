package ArrayAssignment;

public class ArraySortDescending {
	public static void main(String[] args) {

		int arr[] = { 6, 8, 9, 0, -4, 1, 2, 6, 7, 3, 5 };
		System.out.println("*** Element of Array ***");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println("\n***Element of Array after Descending sort ***");
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nThe Largest Number in Array :- "+arr[0]);
		System.out.println("The 3rd Largest Number in Array :- "+arr[2]);
		System.out.println("The 2nd Largest Number in Array :- "+arr[1]);
	}
}
