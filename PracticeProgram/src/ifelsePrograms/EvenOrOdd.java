package ifelsePrograms;

public class EvenOrOdd {

		public static void res(int a) {
			if(a%2==0) {
				System.out.println("Number "+a+" is Even Number.");
			}else {
				System.out.println("Number "+a+" is Odd Number.");
			}
		}
	public static void main(String[] args) {

		System.out.println("*****Program to find Even Or Odd Number*****\n");
		EvenOrOdd.res(2);
		EvenOrOdd.res(7);
		EvenOrOdd.res(19);
		EvenOrOdd.res(2222);
	
	}

}
