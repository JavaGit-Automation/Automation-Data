package Array;

public class Array0 {

	public static void main(String[] args) {

		String[] cars;
		cars=new String[4];
		//or
		String[] cars1=new String[4];
		
		cars[0]="Volvo";
		cars[1]="Bmw";
		cars[2]="Audi";
		cars[3]="Ford";
		//or
		String[] cars2= {"Maruti","Hyundai","Mahindra","Tata"};
		
		//Access the elements of an array with index no.
		System.out.println("****Access the elements of an array with index no****");
		System.out.println("Element of Array cars at Index 0 :- "+cars[0]);
		System.out.println("Element of Array cars at Index 1 :- "+cars[1]);
		System.out.println("Element of Array cars at Index 2 :- "+cars[2]);
		System.out.println("Element of Array cars at Index 3 :- "+cars[3]);
		
		//Array elements count with Function:-predefined method
		System.out.println("\n****Array element count with Function:-predefined method 'arrayname.lenght'****");
		int arraylenght=cars.length;
		System.out.println("Lenght of elements in array 'cars' is:- "+arraylenght);
		
		//Iterate array elements using for-loop
		System.out.println("\n****Iterate array element using for-loop****");
		for(int i=0;i<cars2.length;i++) {
			System.out.println("Element of Array cars2 at Index "+i+" "+ cars2[i]);
		}
		//Iterate array elements using for-each-loop
		System.out.println("\n****Iterate array elements using for-each-loop****");
		for(String num:cars2) {
			System.out.println("Element of array cars2:- "+num);
		}
			
			
		}
		
		
	

	}


