package Abstraction;

abstract class Animal{
	
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Animal is sleeping.");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("Pig sound : Wee Wee");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("Dog sound : Bhow Bhow");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		
		Pig pigref=new Pig();
		pigref.animalSound();
		pigref.sleep();
		Dog dogref=new Dog();
		dogref.animalSound();
		dogref.sleep();
		
	}

}
