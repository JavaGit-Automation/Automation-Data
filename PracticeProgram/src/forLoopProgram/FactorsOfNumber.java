package forLoopProgram;

public class FactorsOfNumber {

	public static void res(int num) {

		System.out.println("Factors Of Number " + num + " are :-");
		if (num < 0) {
			for (int i = num; i <= (num * (-1)); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {

						System.out.print(" " + i);
					}
				}

			}
			System.out.println("\n");
		} else {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(" " + i);
				}

			}
			System.out.println("\n");
		}
	}

	public static void main(String [] args) {

		System.out.println("*****Program to print Factors Of Number*****\n");
		FactorsOfNumber.res(5);
		FactorsOfNumber.res(-10);
		FactorsOfNumber.res(11);
		FactorsOfNumber.res(-123);
		FactorsOfNumber.res(50);

	}

}
