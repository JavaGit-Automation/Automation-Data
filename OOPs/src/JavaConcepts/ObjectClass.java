package JavaConcepts;

class demo{
	void diaplay() {
		System.out.println("This is display method from class Demo");
	}
}
public class ObjectClass extends demo {

	static int last_roll=101;
	int roll_no;
	
	ObjectClass(){
		roll_no=last_roll;	
		last_roll++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectClass o=new ObjectClass();
		
		System.out.println(o);// by default-String representation of an Object
		System.out.println(o.toString());// String representation of an Object
		//output- Fully qualified class name @ hexadecimal value
		
		System.out.println(o.hashCode());//hashcode is intiger value of hexadecimal after conversion
		
		demo d=new ObjectClass();
		System.out.println(d.equals(o));
		
		ObjectClass ob=(ObjectClass)d;
		System.out.println(ob.equals(d));
		
	}

}
