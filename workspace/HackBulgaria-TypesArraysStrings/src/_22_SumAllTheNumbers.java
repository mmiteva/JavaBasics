import java.util.Scanner;

public class _22_SumAllTheNumbers {

	private static int sumOfNumbers(String input) {
		input = input.replaceAll("[\\D]+", " ");
		String[] numbersArray = input.split(" ");
		Integer sum = 0;

		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i].trim().length() != 0) {
				Integer value = Integer.valueOf(numbersArray[i].trim());
				sum = sum + value;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(sumOfNumbers(input));

	}

}
