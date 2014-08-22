import java.util.Scanner;

public class _20_CountOccurencies {

	private static int countOccurencies(String needle, String haystack) {
		int count = haystack.split(needle, -1).length - 1;
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String needle = input.nextLine();
		String haystack = input.nextLine();

		System.out.println(countOccurencies(needle, haystack));

	}

}
