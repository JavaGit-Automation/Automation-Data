package PracticeAssignment;

public class MultOfFloatingNo {

	public static void mul(float a, float b) {
		float res=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+res);
		
	}

	public static void main(String[] args) {

		System.out.println("*****Multiplication of Two Floating Number*****\n");
		MultOfFloatingNo.mul(2.5f, 12.8f);
		MultOfFloatingNo.mul(7.6f, 23.7f);
		MultOfFloatingNo.mul(98.2f, 11.9f);

	}
}
