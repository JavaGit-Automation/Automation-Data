package forLoopProgram;

public class ReverseNumber {

	public static void res(int i) {
		int chkrev=i;
		int lastdigit = 0, reverse = 0;

		for (int num = chkrev; num != 0; num = num / 10) {

			lastdigit = num % 10;
			reverse = reverse * 10 + lastdigit;
		}

		System.out.println("Reverse of num " + chkrev + " is " + reverse);
	}

	public static void main(String[] args) {

		System.out.println("*****Program to write Reverse Number *****\n");
		ReverseNumber.res(1234);
		ReverseNumber.res(456787);

	}
}
