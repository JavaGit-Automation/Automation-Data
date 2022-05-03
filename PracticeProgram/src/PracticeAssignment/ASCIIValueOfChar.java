package PracticeAssignment;

public class ASCIIValueOfChar {

	public static void asciiValue(char a) {
		int temp=a;
		System.out.println("ASCII Vlue of "+a+" is "+temp);
	}

	public static void main(String[] args) {

		System.out.println("*****ASCII Value Of Character*****\n");
		ASCIIValueOfChar.asciiValue('a');
		ASCIIValueOfChar.asciiValue('f');
		ASCIIValueOfChar.asciiValue('A');
		ASCIIValueOfChar.asciiValue('W');

	}

}
