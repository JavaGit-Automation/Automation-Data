package assignment;

public class ClassBody1 {

	static int a;			//Static global veriable
	int b;					//Non-static global veriable
	static {				//Static block
		System.out.println("**** Reverse number using Static Global Veriable & Static Method****");
		ClassBody1.a = 1234;
		System.out.println("Number a = "+a);
	}
	public static void reverse() {		//Static method
		int rev = 0, lastdigit;			//Local Veriables
		for (int num = ClassBody1.a; num != 0; num = num / 10) {
			lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
		}
		System.out.println("Revrse of a " + ClassBody1.a + " is " + rev);
	}
	public static int reverse(int a) {	//Static method overload
		System.out.println("\n**** Reverse number using static method overloading ****");
		System.out.println("Number a = "+a);
		int num = a, rev = 0, lastdigit; //Local veriables
		while (num != 0) {
			lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
			num = num / 10;
		}
		return rev;
	}

	{					//Non-static block
		System.out.println("\n**** Check Palindrome number using Non-Static Global Veriable & Non-Static Method ****");
		b = 456;
		System.out.println("Number b = "+b);
	}
	public void Palindrome() {		//Non-static method
		int rev = 0, lastdigit;     //Local veriables
		for (int num = b; num != 0; num = num / 10) {
			lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
		}
		if (rev == b) {
			System.out.println("The Nubmer " + b + " is Plaindrome Number");
		} else {
			System.out.println("The Nubmer " + b + " is Not Plaindrome Number");
		}
	}
	public int Palindrome(int a) {	//Non-static method overload
		System.out.println("\n**** Check Palindrome using non-static method overloading ****");
		System.out.println("Number b = "+b);
		int num = a, rev = 0, lastdigit;  //Local veriables
		while (num != 0) {
			lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
			num = num / 10;
		}
		if (rev == a) {
			System.out.println("The Nubmer " + a + " is Plaindrome Number");
		} else {
			System.out.println("The Nubmer " + a + " is Not Plaindrome Number");
		}
		return rev;
	}
	public static void main(String[] args) {  //Main Method

		ClassBody1.reverse();

		int a = 9898;
		System.out.println("Revrse of a " + a + " is " + ClassBody1.reverse(a));

		ClassBody1 ref = new ClassBody1();
		ref.Palindrome();
		ref.Palindrome(121);

		ClassBody1 ref1 = new ClassBody1();
		ref1.Palindrome();
		ref.Palindrome(523);
	}

}
