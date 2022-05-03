package Abstraction;

abstract class Shape{
	 abstract void draw();
}
class Triangle extends Shape{
	protected void draw(){
		System.out.println("Drawing Triangle");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
public class AbstractClass1 {

	public static void main(String[] args) {

		Shape ref=new Triangle();
		ref.draw();
		System.out.println("*******************************");
		Shape ref1=new Circle();
		ref1.draw();

	}

}
