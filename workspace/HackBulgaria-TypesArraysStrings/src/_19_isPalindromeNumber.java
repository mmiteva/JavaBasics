import java.util.Scanner;

public class _19_isPalindromeNumber {

	public static boolean isPalindrome(int argument) {
		int palindrome = argument;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		if (argument == reverse) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int argument = input.nextInt();

		System.out.println(isPalindrome(argument));

	}

}
