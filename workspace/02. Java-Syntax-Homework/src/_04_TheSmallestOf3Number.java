import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class _04_TheSmallestOf3Number {

	private static Scanner input;

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);

		input = new Scanner(System.in);
		DecimalFormat decFormat = new DecimalFormat("0.######");

		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		double thirdNumber = input.nextDouble();

		double smallestNumber = Math.min(firstNumber,
				Math.min(secondNumber, thirdNumber));

		System.out.println(decFormat.format(smallestNumber));

	}

}
