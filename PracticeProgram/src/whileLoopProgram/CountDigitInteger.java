package whileLoopProgram;

public class CountDigitInteger {

	public static void res(int i){
		int num=i;
		int count = 0;
		while(num!=0) {
			num=num/10;
			count=count+1;
		}
		System.out.println("Count of numbers of Digit in " +i + " is " + count);
	}

	public static void main(String[] args) {

		System.out.println("*****Program to Count no of digit in Intger Number *****\n");
		CountDigitInteger.res(34551);
		CountDigitInteger.res(345367);
		CountDigitInteger.res(73);
		CountDigitInteger.res(565);
		

	}

}
