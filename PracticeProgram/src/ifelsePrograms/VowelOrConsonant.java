package ifelsePrograms;

public class VowelOrConsonant {

	public static void res(char a) {
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("Character " + a + " is Vowel.");
		} else {
			System.out.println("Character " + a + " is Consonant.");
		}
	}

	public static void main(String[] args) {

		System.out.println("*****Program to find Vowel Or Consonant*****\n");
		VowelOrConsonant.res('a');
		VowelOrConsonant.res('f');
		VowelOrConsonant.res('o');
		VowelOrConsonant.res('m');

	}
}
