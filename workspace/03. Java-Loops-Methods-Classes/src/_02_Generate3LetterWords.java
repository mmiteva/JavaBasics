import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] str = reader.nextLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				for (int j2 = 0; j2 < str.length; j2++) {
					System.out.println("" + str[i] + str[j] + str[j2]);

				}

			}

		}
		reader.close();
	}

}
