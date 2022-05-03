package ArrayAssignment;

import java.util.Arrays;

public class ArrayPrintCopyNoOfElement {

	public static void main(String[] args) {

		int[] arr=new int[] {3,4,2,5,7,9,1};
		System.out.println("***Element of Array 'arr'***");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\nNo of Element in Array:- "+arr.length);
	
		int[] arr1=Arrays.copyOf(arr, arr.length);
		System.out.println("\n***Element of Array 'arr1' after copy from 'arr'***");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
