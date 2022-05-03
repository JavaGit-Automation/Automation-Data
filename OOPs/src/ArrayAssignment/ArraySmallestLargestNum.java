package ArrayAssignment;

import java.util.Arrays;

public class ArraySmallestLargestNum {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 9, 97, 2, 22, 69, 1};
		System.out.println("***Elements Of Array before Reverse***");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print("\nSmallest Elements Of Array:- "+min);
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.print("\nLargest Elements Of Array:-"+max);

		Arrays.sort(arr);
		System.out.print("\nLargest Elements Of Array Using Sort Function:- "+arr[arr.length - 1]);
		System.out.print("\nSmallest Elements Of Array Using Sort Function:- "+arr[0]);
	}

}
