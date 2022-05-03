package Abstraction;

abstract class Demo{
	Demo(){
		System.out.println("I am constructor of Demo");
	}
	public abstract void display();
	public void print() {
		System.out.println("I am non abstract method from super class Demo");	
	}
}
class Demo1 extends Demo{
	public void display() {
		super.print();
		System.out.println("I am method from sub class Demo1 :-overide abstract method of class Demo");
	}
}
class Demo2 extends Demo1{
	public void display() {
//		super.display();
		System.out.println("I am method from sub class Demo2 :-overide  method of class Demo1");
	}
	
}
public class AbstactClass0 {

	public static void main(String[] args) {

		Demo2 ref=new Demo2();
		ref.print();
		ref.display();
		System.out.println("******************************");
		Demo1 ref1=new Demo1();
		ref1.display();

	} 

}
