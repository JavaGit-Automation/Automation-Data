package ArrayAssignment;

public class ArrayFrequency {

	public static void main(String[] args) {

		int arr[] = { 1,6, 2, 3,8,6, 2, 4, 6, 7, 5, 3, 4, 3 };
		int freq[] = new int[arr.length];
		int remElement = -1;
		System.out.println("**** Elements of an Array ****");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
					freq[j] = remElement;
				}
			}
			if (freq[i] != remElement) {
				freq[i] = count;
			}
		}
		System.out.println("\nFrequency of each Elements in Array:-");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != remElement)
				System.out.println(arr[i] + " - " + freq[i]);
		}

	}
}
