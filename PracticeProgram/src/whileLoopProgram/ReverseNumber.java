package whileLoopProgram;

public class ReverseNumber {

	public static void res(int i) {
		int num = i;
		int lastdigit = 0, reverse = 0;

		while (num != 0) {

			lastdigit = num % 10;
			reverse = reverse * 10 + lastdigit;
			num = num / 10;
		}

		System.out.println("Reverse of num " + i + " is " + reverse);
	}

	public static void main(String[] args) {

		System.out.println("*****Program to write Reverse Number *****\n");
		ReverseNumber.res(1234);
		ReverseNumber.res(456787);

	}

}
