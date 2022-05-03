package StringClassJava;

public class StringClass2 {

	public static void main(String[] args) {

		String str="I Love My India";
		System.out.println("Actual String:- "+str);
		System.out.println("All element of String:- ");
		String[] st=str.split(" ");
		for(String s:st) {
			System.out.println(s);
		}
		
		System.out.println("\nElement of String devide in 3 parts:- ");

		String[] st1=str.split(" ", 3);
		for(String s:st1) {
			System.out.println(s);
		}
		
		System.out.println("\nElement of String in reverse:- ");
		String[] st2=str.split(" ");
		String temp="";
		for(int i=st2.length-1;i>=0;i--) {
			
			temp=temp+st2[i]+" ";
		}
		System.out.println(temp);
		
		String s1="CoreJavaBasic";
		System.out.println("\nActual String:- "+s1);
		System.out.println("Substring from index 4:- "+s1.substring(4));
		System.out.println("Substring from index 7:- "+s1.substring(7));
		System.out.println("Substring from 2-7 :- "+s1.substring(2, 7));
		
		String s2="Class";
		System.out.println("s1 concat s2= "+s1.concat(s2));
		
		System.out.println("\nActual String :- "+str);
		System.out.println("Index of 'Love' starts from:- "+str.indexOf("Love"));
		System.out.println("Index of 'I' after index 3 is "+str.indexOf('I',3));
		System.out.println("Index of 'L' starts from :- "+str.indexOf('L'));
		System.out.println("Index of 'I' before index 11 is "+str.lastIndexOf('I',11));
		System.out.println("Last index of 'I' is "+str.lastIndexOf('I'));
		
		String s3="I am from Navi Mumbai";
		System.out.println("\nActual String:- "+s3);
		System.out.println("String in Lowercase :- "+s3.toLowerCase());
		System.out.println("String in Uppercase :- "+s3.toUpperCase());
		
		System.out.println("\nReplace 'Navi Mumbai' with 'Panvel' :- "+s3.replace("Navi Mumbai", "Panvel"));
		System.out.println("Replace 'a' with 'x' :- "+s3.replace('a','x'));
		System.out.println("Replace 1st 'm' with 'w' :- "+s3.replaceFirst("m", "w"));
		
		String s4="";
		String s5=" ";
		String s6=new String();
		System.out.println("\nIs String s4 is empty:- "+s4.isEmpty());
		System.out.println("Is String s5 is empty:- "+s5.isEmpty());
		System.out.println("Is String s5 is empty:- "+s6.isEmpty());
		
		
		
		
		
	}

}
