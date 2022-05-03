package forLoopProgram;

public class SumOfNaturalNum {

	public static void res(int num) {
		int count = 0, temp = num;
		for (int i = 1; i <= temp; i++) {
			count = count + i;
		}
		System.out.println("Sum of numbers from 1 to " + num + " is " + count);
	}

	public static void main(String[] args) {

		System.out.println("*****Program to Sum of n Natural Number *****\n");
		SumOfNaturalNum.res(5);
		SumOfNaturalNum.res(11);

	}

}
