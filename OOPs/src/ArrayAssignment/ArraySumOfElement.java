package ArrayAssignment;

public class ArraySumOfElement {

	public static void main(String[] args) {

		double[] arr= {10,45,12.4,6,90,1.7,55.8};
		System.out.println("***Elelments Of Array***");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("\nSum of elements in array is :- "+sum);
	}

}
