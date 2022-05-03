package whileLoopProgram;

public class PrimeWhile {
	
	public static void res(int num) {
		int i=1;
		while(i<=num) {
			int j=1, count=0; 
			while(j<=i) {
				if(i%j==0) {
					count=count+1;
				}j++;
			}if(count==2) {
				System.out.print(i+" ");
			}i++;
		}
	}
	public static void main(String[] args) {

		System.out.println("******Program To Check Prime Number******");
		PrimeWhile.res(100);

	}

}
