package forLoopProgram;

public class PalindromeNumber {

	public static void res(int i) {
		int chkpalindrome=i;
		int lastdigit = 0, reverse = 0;

		for (int num = chkpalindrome; num != 0; num = num / 10) {

			lastdigit = num % 10;
			reverse = reverse * 10 + lastdigit;
		}

		if (reverse == chkpalindrome) {
			System.out.println("The number " + chkpalindrome + " is " + "Palindrome Number");
		} else {
			System.out.println("The number " + chkpalindrome + " is " + " Not Palindrome Number");
		}
	}

	public static void main(String[] args) {

		System.out.println("*****Program to write Reverse Number *****\n");
		PalindromeNumber.res(1234);
		PalindromeNumber.res(121);
		PalindromeNumber.res(1001);
		PalindromeNumber.res(1221);

	}

}
