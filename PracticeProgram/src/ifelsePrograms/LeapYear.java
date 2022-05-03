package ifelsePrograms;

public class LeapYear {

	public static void res(int a) {
		if(a%4==0 && a%100!=0 || a%400==0) {
			System.out.println("The Year "+a+" is Leap Year.");
		}else {
			System.out.println("The Year "+a+" is Not Leap Year.");
		}
	}
public static void main(String[] args) {

	System.out.println("*****Program to find Leap Year or Not*****\n");
	LeapYear.res(1900);
	LeapYear.res(1634);
	LeapYear.res(2012);
	LeapYear.res(2013);
	LeapYear.res(1880);
	LeapYear.res(2015);
	LeapYear.res(2016);

}

}
