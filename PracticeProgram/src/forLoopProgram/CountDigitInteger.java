package forLoopProgram;

public class CountDigitInteger {

	public static void res(int num) {
		int count = 0;
		for (int i=num;i!=0;i=i/10) {
		
			count=count+1;
		}
		System.out.println("Count of numbers of Digit in " + num + " is " + count);
	}

	public static void main(String[] args) {

		System.out.println("*****Program to Count no of digit in Intger Number *****\n");
		CountDigitInteger.res(4321);
		CountDigitInteger.res(-4521780);
		CountDigitInteger.res(76543);
		CountDigitInteger.res(555);
		CountDigitInteger.res(5);
		

	}

}
