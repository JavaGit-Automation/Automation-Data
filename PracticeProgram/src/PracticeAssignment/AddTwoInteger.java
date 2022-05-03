package PracticeAssignment;

public class AddTwoInteger {
	
	public static void add(int a, int b) {
		int res=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+res);
	}

	public static void main(String[] args) {

		System.out.println("*****Addition of Two Integer*****\n");
		AddTwoInteger.add(1, 2);
		AddTwoInteger.add(12, 23);
		AddTwoInteger.add(123, 234);

	}

}
