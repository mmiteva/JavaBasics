import java.util.Scanner;

public class _01_isOdd {

	private static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter an integer number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.printf("Is it an odd number? " + isOdd(n));

	}

}
