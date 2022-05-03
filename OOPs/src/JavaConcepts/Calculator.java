package JavaConcepts;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double num1,num2;
		char ch;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("**** SIMPLE CALCULATOR *****");
		System.out.print("ENTER NUMBER 1 :- ");
		num1=scn.nextDouble();
		System.out.print("ENTER NUMBER 2 :- ");
		num2=scn.nextDouble();
		System.out.println("OPERATOR:- +, -, *, /, % ");
		System.out.println("ENTER OPERATOR :- ");
		ch=scn.next().charAt(0);
		
		switch(ch) {
		
		case '+':
			System.out.println("ADDITION:- "+num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println("SUBSTRACTION:- "+num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println("MULTIPLICATION:- "+num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/':
			System.out.println("DIVISION:- "+num1+" / "+num2+" = "+(num1/num2));
			break;
		case '%':
			System.out.println("MODULES:- "+num1+" % "+num2+" = "+(num1%num2));
			break;
		default :
				System.out.println("Invalid Operator, Try again.");
		}
		

	}

}
