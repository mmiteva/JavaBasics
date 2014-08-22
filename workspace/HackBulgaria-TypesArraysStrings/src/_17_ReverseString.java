import java.util.Scanner;

public class _17_ReverseString {

	private static String reverseMe(String argument) {
		String reversedStr = new StringBuilder(argument).reverse().toString();
		return reversedStr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String argument = input.nextLine();

		System.out.println(reverseMe(argument));
	}

}
