package Array;

public class Array2 {

	public static void main(String[] args) {

		int[] array1=new int[] {1,2,3,4,6,3,2,1,9,6};
		
		System.out.println("Printing array element using for-loop");
		for(int i=0;i<array1.length;i++) {
			System.out.println("Element at index "+i+" is "+array1[i]);
		}
		System.out.println();
		double sum=0;
		double avg;
		for(int i=0;i<array1.length;i++) {
				sum=sum+array1[i];
		}
		System.out.println("Sum of elements in array1 is :- "+sum);
		avg=sum/array1.length;
		System.out.println("Average of elements in array1 is :- "+avg);
	}

}
