package forLoopProgram;

public class ArmstrongNumber {

	public static void res(int a) {

		int count = 0, rem = 0, chkarm = 0;
		for (int num = a; num != 0; num = num / 10) {
			count = count + 1;
		}

		for (int i = a; i != 0; i = i / 10) {
			int temp = 1;
			int count1 = count;
			for (; count1 > 0; count1 = count1 - 1) {
				rem = i % 10;
				temp = temp * rem;
			}
			chkarm = chkarm + temp;
		}
		int num1 = a;
		if (chkarm == num1) {
			System.out.println(num1 + " is Armstrong Number.");
		} else {
			System.out.println(num1 + " is Not a Armstrong Number.");
		}
	}

	public static void main(String[] args) {

		System.out.println("*****Program to find Armstrong Number *****\n");

		ArmstrongNumber.res(123);
		ArmstrongNumber.res(9);
		ArmstrongNumber.res(371);
		ArmstrongNumber.res(153);
		ArmstrongNumber.res(2345);
		ArmstrongNumber.res(8208);

	}

}
