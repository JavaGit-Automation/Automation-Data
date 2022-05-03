package whileLoopProgram;

public class ArmstrongNumber {

	public static void res(int a) {
		int num = a;
		int rem, chkarm = 0, count = 0;
		while (num != 0) {
			num = num / 10;
			count = count + 1;
		}
		num = a;
		while (num != 0) {
			int temp = 1;
			int count1 = count;
			while (count1 > 0) {
				rem = num % 10;
				temp = temp * rem;
				count1 = count1 - 1;
			}
			chkarm = chkarm + temp;
			num = num / 10;
		}
		num = a;
		if (chkarm == num) {
			System.out.println(num + " is Armstrong Number.");
		} else {
			System.out.println( num + " is Not a Armstrong Number.");
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
