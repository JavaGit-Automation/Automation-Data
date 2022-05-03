package JavaConcepts;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int num1,num2;
		System.out.println("ADITION OPERATION");
		System.out.print("ENTER NUM1:- ");
		num1=scn.nextInt();
		System.out.print("ENTER NUM2:- ");
		num2=scn.nextInt();
	
		System.out.println(num1+" + "+num2+" = "+(num1+num2));

	}

}
