package StringClassJava;

import java.util.Scanner;

public class StringClass1 {

	public static void main(String[] args) {

		String s1="JavaStringClass";
		System.out.println("String Characters:- ");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+" ");
		}
//		for(String s:s1) {
//			System.out.println(s);
//		}
		System.out.println("\nString Characters in Reverse:- ");
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			temp=temp+s1.charAt(i);
			System.out.print(s1.charAt(i)+" ");
		}
		if(s1.equals(temp)) {
			System.out.println("\nThe String-"+s1+" is Palindrome");
		}
		else {
			System.out.println("\nThe String-"+s1+" is not Palindrome");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter String to check Palindrome:- ");
		String str=sc.next();
		StringClass1 ref=new StringClass1();
		ref.checkPalindrome(str);
		
	}
	public void checkPalindrome(String str) {
		String temp="";
		System.out.println("\nString  in Reverse:- ");
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
			System.out.print(str.charAt(i));
		}
		if(temp.equals(str)) {
			System.out.println("\nThe String-"+str+" is Palindrome");
		}
		else {
			System.out.println("\nThe String-"+str+" is not Palindrome");
		}
	}

}
