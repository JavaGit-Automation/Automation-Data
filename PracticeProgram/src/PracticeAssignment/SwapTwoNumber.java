package PracticeAssignment;

public class SwapTwoNumber {

	public static void res(int a, int b) {
		System.out.println("Value beore Swap :- a= "+a+" & b= "+b);
		int temp=a+b;
		a=temp-a;
		b=temp-b;
		System.out.println("Value After Swap :- a= "+a+" & b= "+b+"\n");
		
		
	}

	public static void main(String[] args) {

		System.out.println("*****Program to Swap Two Numbers*****\n");
		SwapTwoNumber.res(12, 34);
		SwapTwoNumber.res(213, 637);
		SwapTwoNumber.res(100, 200);
		SwapTwoNumber.res(777, 444);
	}

}
