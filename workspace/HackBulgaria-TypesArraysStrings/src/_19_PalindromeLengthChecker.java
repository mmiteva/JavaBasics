import java.util.Scanner;

public class _19_PalindromeLengthChecker {

	private static int getPalindromeLength(String input) {
		String[] arr = input.split("\\*");
		return arr.length;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(getPalindromeLength(input));

	}

}
