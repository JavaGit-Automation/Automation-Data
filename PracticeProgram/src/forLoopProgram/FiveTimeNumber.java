package forLoopProgram;

public class FiveTimeNumber {

	public static void res(int num) {
		int temp = num;
		for (int i = 1; i <= temp; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		System.out.println("*****Program to print number by given parameter times*****\n");
		FiveTimeNumber.res(5);
		FiveTimeNumber.res(7);
		FiveTimeNumber.res(11);

	}

}
