package forLoopProgram;

public class PrimeNumber {

	public static void res(int num) {
		int i=num;
		int count=0;
		if(i==0||i==1) {
			System.out.println("The Number "+i+" is Not Prime Number.");
		}
		else {
			for(int j=2;j<i;j++) {
				if(i%2==0) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println("The Number "+i+" is  Prime Number.");
			}else {
				System.out.println("The Number "+i+" is Not Prime Number.");
			}
		}
	}
	public static void main(String[] args) {

		System.out.println("******Program To Check Prime Number******");
		PrimeNumber.res(3);
		PrimeNumber.res(13);
		PrimeNumber.res(4);
		PrimeNumber.res(20);

	}

}
