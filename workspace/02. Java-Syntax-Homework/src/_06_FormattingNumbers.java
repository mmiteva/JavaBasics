import java.util.Locale;
import java.util.Scanner;

public class _06_FormattingNumbers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		Scanner inputRoot = new Scanner(System.in);

		int a = inputRoot.nextInt();
		double b = inputRoot.nextDouble();
		double c = inputRoot.nextDouble();
		String hex = Integer.toHexString(a).toUpperCase();
		String bin = String.format("%10s", Integer.toBinaryString(a)).replace(
				' ', '0');

		// Locale.setDefault(new Locale("BG", "BG"));

		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", hex, bin, b, c);

		inputRoot.close();

	}

}
