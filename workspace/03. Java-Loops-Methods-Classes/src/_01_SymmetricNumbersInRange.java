import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static boolean isSymmetric(String str) {

		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		for (int i = start; i <= end; i++) {
			if (isSymmetric(Integer.toString(i))) {
				System.out.println(i);

			}
		}

		input.close();
	}
}
