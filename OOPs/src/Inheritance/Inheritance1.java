package Inheritance;

class A{
	int a=10,b=20;
	void methodA(int a,int b) {
		System.out.println("This is Method in Class A");
		System.out.println("a  + b = "+(a+b));
		this.a=40;
		System.out.println("a variable from Class A "+this.a);
	}
}

class B extends A{
	void methodB() {
		System.out.println("This is Method in Class B");
	}
}

class C extends B{
	void methodC() {
		System.out.println("This is Method in Class C");
	}
	
}

public class Inheritance1 {

	public static void main(String[] args) {

		C ref=new C();
		System.out.println("a variable from Class A "+ref.a);
		System.out.println("b variable from Class A "+ref.b);
		ref.methodA(10,15);
		ref.methodB();
		ref.methodC();
		

	}

}
