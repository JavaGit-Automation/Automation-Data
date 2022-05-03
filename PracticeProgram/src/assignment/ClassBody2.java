package assignment;

class Demo {

	static int a;  //Static global variable
	int b;         //Non-static global veriable
	static {       //Static block
		System.out.println("\n*****PRIME NUMBER USING STATIC MEMBERS IN CLASS-Demo*****");
		Demo.a = 137;
		System.out.println("Number a = " + a);
	}
	{              //Non-static block
		System.out.println("\n*****SUM OF DIGIT USING NON-STATIC MEMBERS IN CLASS-Demo*****");
		b = 12;
		System.out.println("Number b = " + b);
	}
	public static void prime() {      //Static Method
		int count = 0;				  //Local veriable
		int num = Demo.a;
		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				count = count + 1;
			}
		}
		if (count == 0) {
			System.out.println("The Number " + num + " is Prime Number.");
		} 
		else {
			System.out.println("The Number " + num + " is Not Prime Number.");
		}
	}
	public static void prime(int num) {    //Static Method Overload
		System.out.println("\n*****PRIME NUMBER USING STATIC METHOD OVELOADING IN CLASS-Demo*****");
		System.out.println("Count of Prime Numbers Till = " + num);
		int i = 1;						//Local veriables
		while (i <= num) {
			int j = 1, count = 0;
			while (j <= i) {
				if (i % j == 0) {
					count = count + 1;
				}
				j++;
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}

	public void sumOfDigit() {      //Non-static method
		int count = 0;              //Local veriable
		for (int num = 1; num <= b; num++) {
			count = count + num;
		}
		System.out.println("Sum of Digit in Number " + b + " is " + count);
	}

	public void sumOfDigit(int num) {      //Non-static method overload
		System.out.println("\n*****SUM OF DIGIT USING NON-STATIC METHOD OVERLOADING IN CLASS-Demo*****");
		System.out.println("Number a = " + num);
		int count = 0;
		int i=1;
		while (i <= num) {
			count = count + i;
			i++;
		}
		System.out.println("Sum of Digit in Number " + num + " is " + count);
	}

}
public class ClassBody2 {
	static int a;               //Static global veriable
	int b;						//Non-static global veriable
	static {					//Static block
		System.out.println("\n*****COUNT DIGIT USING STATIC MEMBERS IN CLASS-ClassBody2*****");
		ClassBody2.a = 53567;
		System.out.println("Number a = " + a);
	}
	{							//Non-static block
		System.out.println("\n*****FACTORS OF +VE NUMBER USING NON-STATIC MEMBERS IN CLASS-ClassBody2*****");
		b = 125;
		System.out.println("Number b = " + b);
	}
	public static void countDigit() {             //Static method
		int count = 0;
		for (int num = ClassBody2.a; num != 0; num = num / 10) {
			count = count + 1;
		}
		System.out.println("Numbers of Digit in " + ClassBody2.a + " is " + count);
	}
	public static void countDigit(int num) {		 //Static method overload
		System.out.println("\n*****COUNT DIGIT USING STATIC METHOD OVERLOADING IN CLASS-ClassBody2*****");
		System.out.println("Number a = " + num);
		int count = 0;
		int i=num;
		while(i != 0) {
			count = count + 1;
			i = i / 10;
		}
		System.out.println("Numbers of Digit in " + num + " is " + count);
	}
	public void factorsOfNum() {				//Non=static method
		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	public void factorsOfNum(int num) {			//Non-static method overload
		System.out.println("\n*****FACTORS OF -VE NUMBER USING NON-STATIC MEMBERS IN CLASS-ClassBody2*****");
		System.out.println("Number a = " + num);
		for (int i = num; i <= (num * (-1)); i++) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {

		ClassBody2.countDigit(); 
		ClassBody2.countDigit(2554444);

		ClassBody2 ref = new ClassBody2();
		ref.factorsOfNum();
		ref.factorsOfNum(-60);

		Demo.prime();
		Demo.prime(100);

		Demo ref1 = new Demo();
		ref1.sumOfDigit();
		ref1.sumOfDigit(100);

	}

}
