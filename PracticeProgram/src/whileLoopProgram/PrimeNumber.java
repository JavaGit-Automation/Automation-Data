package whileLoopProgram;

public class PrimeNumber {

	public static void res(int num) {
		int i = num;
		int count = 0, j = 0;
		if (i == 0 || i == 1) {
			System.out.println("The Number " + i + " is Not Prime Number.");
		} else {

			while (j < i) {

				if (i % 2 == 0) {
					count = count + 1;
				}
				j++;
			}
			if (count == 0) {
				System.out.println("The Number " + i + " is  Prime Number.");
			} else {
				System.out.println("The Number " + i + " is Not Prime Number.");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("******Program To Check Prime Number******");
		PrimeNumber.res(0);
		PrimeNumber.res(13);
		PrimeNumber.res(4);
		PrimeNumber.res(20);
		PrimeNumber.res(57);

	}

}
