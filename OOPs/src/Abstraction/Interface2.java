package Abstraction;

interface Bank {
	double rateOfInterest();
}

class SBI1 implements Bank {
	public double rateOfInterest() {
		return 6.5;
	}
}

class PNB1 implements Bank {
	public double rateOfInterest() {
		return 7.5;
	}
}

public class Interface2 {
	public static void main(String[] args) {
		SBI1 ref=new SBI1();
		System.out.println("Rate Of Interest Of SBI:- "+ref.rateOfInterest());
		PNB1 ref1=new PNB1();
		System.out.println("Rate Of Interest Of PNB:- "+ref1.rateOfInterest());
		Bank ref3=new SBI1();
		System.out.println("ROI:- "+ref3.rateOfInterest());

	}

}
