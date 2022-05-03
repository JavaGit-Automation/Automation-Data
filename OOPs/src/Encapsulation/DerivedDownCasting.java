package Encapsulation;

class JD {
	public void printJD() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
class Java extends JD {
	public void printJava() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
class Android extends Java {
	public void printAndroid() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class DerivedDownCasting {

	public static void main(String[] args) {

		JD j1=new Android();
		j1.printJD();
		j1.disp();
		System.out.println("************************");
		Java j2=(Java)j1;
		j2.printJD();
		j2.printJava();
		j2.disp();
		System.out.println("************************");
		Android a1=(Android)j1;
		a1.printJD();
		a1.printJava();
		a1.printAndroid();
		a1.disp();	//

	}

}
