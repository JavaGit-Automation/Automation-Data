package Array;

class Testarray1{
	
	static int[] getarray() {
		
		return new int[]{10,20,30,40,50};
	}
}

public class Array4 {

	public static void main(String[] args) {

		int[] arr=Testarray1.getarray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
