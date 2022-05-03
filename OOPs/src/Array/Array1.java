package Array;

public class Array1 {

	public static void main(String[] args) {

		int a[];
		a=new int[5];
		
		int a1[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("Elementa of array 'a' at index 0 "+a[0]);
		System.out.println("Elementa of array 'a' at index 1 "+a[1]);
		System.out.println("Elementa of array 'a' at index 2 "+a[2]);
		System.out.println("Elementa of array 'a' at index 3 "+a[3]);
		System.out.println("Elementa of array 'a' at index 4 "+a[4]);
		
		System.out.println("\nArray elements count of 'a' is :- "+a.length);
		System.out.println();
		for(int i=0; i<a.length;i++) {
			System.out.println("Element of array 'a' at index "+i+" is "+a[i]);
		}
		System.out.println();
		for(int num:a) {
			System.out.println("Element of array a :- "+num);
		}

	}

}
