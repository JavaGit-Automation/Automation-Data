package whileLoopProgram;

public class PalindromeNumber {

	public static void res(int i) {
		int num = i;
		int lastdigit = 0, reverse = 0;

		while (num != 0) {
			lastdigit = num % 10;
			reverse = reverse * 10 + lastdigit;
			num = num / 10;
		}

		if (reverse == i) {
			System.out.println("The number " + i + " is " + "Palindrome Number");
		} else {
			System.out.println("The number " + i + " is " + " Not Palindrome Number");
		}
	}

	public static void main(String[] args) {

		System.out.println("*****Program to write Reverse Number *****\n");
		PalindromeNumber.res(4563);
		PalindromeNumber.res(212);
		PalindromeNumber.res(5555);
		PalindromeNumber.res(8787);

	}

}
