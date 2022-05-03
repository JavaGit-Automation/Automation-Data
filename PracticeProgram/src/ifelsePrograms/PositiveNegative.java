package ifelsePrograms;

public class PositiveNegative {

	public static void res(double a) {
		if (a == 0) {
			System.out.println("Number " + a + " is Nutral Number.");
		} else if(a>0) {
			System.out.println("Number " + a + " is Positive Number.");
		}
		else {
			System.out.println("Number " + a + " is Negative Number.");
		}
	}

	public static void main(String[] args) {

		System.out.println("*****Program to find Positive Or Negative Number*****\n");
		PositiveNegative.res(12);
		PositiveNegative.res(-9);
		PositiveNegative.res(56);
		PositiveNegative.res(0);
		PositiveNegative.res(-345);


	}

}
