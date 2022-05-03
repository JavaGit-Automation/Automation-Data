package Array;

import java.util.Arrays;

public class ArrayFunctions {

	public static void main(String[] args) {

		int[] arr1 = { 33, 11, 55, 44, 22 };
		System.out.println("\n*** Printing Original Array-arr1 ***");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("\n*** Printing Clone of 'arr1' ***");
		int[] arr2 = arr1.clone();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("\n***Are both Arrays 'arr1' & 'arr2' equal?***");
		boolean res=Arrays.equals(arr1, arr2);
		System.out.println(res);

		System.out.println("\n***function 'copyOf' :-aar2 into aar3 function***");
		int[] arr3 = Arrays.copyOf(arr2, 3);
		for (int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("\n***function 'copyOfRange' :-from arr3 to arr4 ***");
		int[] arr4 = Arrays.copyOfRange(arr3, 0, 6);
		for (int i : arr4) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("\n***function 'sort' :-of arr4***");
		Arrays.sort(arr4);
		for (int i : arr4) {
			System.out.print(i + " ");
		}

	}

}
