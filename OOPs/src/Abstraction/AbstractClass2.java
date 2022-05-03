package Abstraction;
abstract class RBIbank{
	public RBIbank() {
		System.out.println("As Per RBI Bank");
	}
	
	abstract double roi();
}
class SBIbank extends RBIbank{
	public double roi() {
		return 6.5;
	}
}
class BOIbank extends RBIbank{
	public double roi() {
		return 7.5;
	}
}
public class AbstractClass2 {

	public static void main(String[] args) {

		SBIbank ref1=new SBIbank();
		System.out.println("SBI Rate of Interest is: " + ref1.roi() + " %");
		BOIbank ref=new BOIbank();
		System.out.println("BOI Rate of Interest is: " + ref.roi() + " %");
		
		RBIbank ref2=new SBIbank();
		System.out.println("SBI Rate of Interest is: " + ref2.roi() + " %");
		RBIbank ref3=new BOIbank();
		System.out.println("BOI Rate of Interest is: " + ref3.roi() + " %");

	}

}
