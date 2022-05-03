package Array;

public class Arraycopy {

	public static void main(String[] args) {

		char[] arr1= {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
		char[] arr2=new char[5];
		
	
		System.arraycopy(arr1, 3, arr2, 0, arr2.length);
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2 element : "+arr2[i]);
		}
	}

}
