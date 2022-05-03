package ifelsePrograms;

public class LargestNumber {

	public static void res1(int a, int b, int c) {
		if(a>b && a>c ) {
			System.out.println("Number "+a+" is Greater Number Than "+b+" and "+c);
		}else if(b>c && b>a){
			System.out.println("Number "+b+" is Greater Number Than "+a+" and "+c);
		}else {
			System.out.println("Number "+c+" is Greater Number Than "+a+" and "+b);
		}
	}

	public static void main(String[] args) {

		System.out.println("*****Program to find Largest Numer *****\n");
		LargestNumber.res1(1,2,3);
		LargestNumber.res1(21,11,60);
		
		LargestNumber.res1(11,2,5);
		LargestNumber.res1(45,10,12);
		
		LargestNumber.res1(34,111,3);
		LargestNumber.res1(65,3333,2309);
	}

}
