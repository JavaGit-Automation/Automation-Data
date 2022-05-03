package JavaConcepts;

class New{
	
	private New() {
		System.out.println("New Class constructor");
	}
	
	static New n=new New();
	
	public static New getPrivateConstructor() {
		
		return n;
	}
	
	void display() {
		System.out.println("This id display method");
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		
		//New n=new New(); it will give error as constructor is private
		
		New.n.getPrivateConstructor();
		New.n.display();
		
	    New.getPrivateConstructor().display();
		
	}
}
