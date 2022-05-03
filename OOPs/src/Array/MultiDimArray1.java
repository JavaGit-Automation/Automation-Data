package Array;

public class MultiDimArray1 {

	public static void main(String[] args) {

		int arr[][]= {{1,1,1},{2,2,2},{3,3,3}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		char[] ar[]=new char[][] {{'a','b','c'},{'e','f','g','h','i'},{'j','k','l','m'}};
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
