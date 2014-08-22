import java.util.Arrays;
import java.util.Scanner;

public class _23_StringAAnagramStringB {

	private static boolean anagram(String A, String B) {
		char[] firstWord = A.toCharArray();
		char[] secondWord = B.toCharArray();

		Arrays.sort(firstWord);
		Arrays.sort(secondWord);

		return Arrays.equals(firstWord, secondWord);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String A = input.nextLine();
		String B = input.nextLine();

		System.out.println(anagram(A, B));

	}

}
