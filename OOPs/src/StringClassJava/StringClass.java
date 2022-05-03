package StringClassJava;

public class StringClass {

	public static void main(String[] args) {

		//String class object using new keyword
		StringClass str=new StringClass();
		System.out.println("str:- "+str.toString());
		
		//String class object using Literal
		String s1="Mumbai";
		String s2="Mumbai";
		String s3="Banglore";
		System.out.println("\ns1= "+s1);
		System.out.println("s2= "+s2);
		System.out.println("s3= "+s3);
		System.out.println("s1 lenght= "+s1.length());
		System.out.println("s2 lenght= "+s2.length());
		System.out.println("s3 lenght= "+s3.length());
		
		/**
		 * Outside String class:
		 * 		== --> compare two values
		 * 		.equals(obj) --> compare two objects based on there address
		 * Inside String class:
		 * 		== --> compare two objects based on address
		 * 		.equals(obj) --> compare two objects based value
		 */
		
		System.out.println("\ns1.equals(s2) :- "+s1.equals(s2));
		System.out.println("s1==s2 :- "+(s1==s2));
		System.out.println("\ns1.equals(s3) :- "+s1.equals(s3));
		System.out.println("s1==s2 :- "+(s1==s3));
		
		String s4=new String("Mumbai");
		System.out.println("\ns1.equals(s4) :- "+s1.equals(s4));
		System.out.println("s1==s2 :- "+s1==s4);
	}

}
