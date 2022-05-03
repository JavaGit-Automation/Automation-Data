package Array;

import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {

		int[] num1= {10,20,30,40};
		for(int i=0;i<num1.length;i++) {
			System.out.println("Num1 Element:- "+num1[i]);
		}
		System.out.println();
		int[] num2=Arrays.copyOf(num1, 5);
		for(int i=0;i<num2.length;i++) {
			System.out.println("Num2 Element:- "+num2[i]);
		}
		
		num2[1]=22;
		num2[2]=33;
		
		System.out.println();
		int num3[]=Arrays.copyOf(num2, 4);
		for(int i=0;i<num3.length;i++) {
			System.out.println("Num3 Element:- "+num3[i]);
		}
	}

}
