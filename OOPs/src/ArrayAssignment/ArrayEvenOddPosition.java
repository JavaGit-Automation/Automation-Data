package ArrayAssignment;

public class ArrayEvenOddPosition {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("***Element of Array 'arr'***");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n***Element of Array Present on Even Position***");
		for (int i = 1; i < arr.length; i = i+2) {  
            System.out.print(arr[i]+" ");  
        }  
		
		System.out.println("\n***Element of Array Present on Odd Position***");
		for (int i = 0; i < arr.length; i = i+2) {  
            System.out.print(arr[i]+" ");  
        }  
		

	}

}
