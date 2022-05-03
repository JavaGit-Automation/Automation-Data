package switchCase;

public class Calculator {
	
	public static void res(char ch, int a, int b) {
		int res;
		switch(ch) {
		case '+':
			res=a+b;
			System.out.println("Addition of "+a+" and "+b+" is "+res);
			break;
		case '-':
			res=a-b;
			System.out.println("Sbstraction of "+a+" and "+b+" is "+res);
			break;
		case '*':
			res=a*b;
			System.out.println("Multiplication of "+a+" and "+b+" is "+res);
			break;
		case '/':
			res=a/b;
			System.out.println("Division of "+a+" and "+b+" is "+res);
			break;
		default:
			System.out.println("You have enter wrong operator");
		}
	}

	public static void main(String[] args) {
		

		System.out.println("*****Program to do simple Arithmatic Operation *****\n");
		Calculator.res('+', 20, 10);
		Calculator.res('-', 20, 10);
		Calculator.res('*', 20, 10);
		Calculator.res('/', 20, 10);
		
	}

}
