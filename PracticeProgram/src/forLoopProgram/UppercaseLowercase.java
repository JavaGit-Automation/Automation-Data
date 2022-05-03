package forLoopProgram;

public class UppercaseLowercase {

	public static void upper() {
		System.out.println("******Uppercase Alphabets******");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n");
	}
	public static void lower() {
		System.out.println("******Lowercase Alphabates******");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		System.out.println("*****Program to print Uppercase And Lowercase Alphabets*****\n");
		UppercaseLowercase.upper();
		UppercaseLowercase.lower();

	}

}
