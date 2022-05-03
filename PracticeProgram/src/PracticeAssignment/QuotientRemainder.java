package PracticeAssignment;

public class QuotientRemainder {

	public static void res(int a, int b) {
		float quot=a/b;
		int rem=a%b;
		System.out.println("If "+a+" is devide by "+b+" the Quotient is "+quot+" and Remainder is "+rem);
	}

	public static void main(String[] args) {

		System.out.println("*****Program to find Ouotient and Remainder*****\n");
		QuotientRemainder.res(15, 3);
		QuotientRemainder.res(10, 4);
		QuotientRemainder.res(123, 11);
		QuotientRemainder.res(4115, 47);
	}

}
