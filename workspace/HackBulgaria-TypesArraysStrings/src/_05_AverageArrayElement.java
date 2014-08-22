import java.util.Scanner;

public class _05_AverageArrayElement {

	private static int getAverage(int[] array) {
		int sum = 0;
		int average;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		average = sum / array.length;

		return average;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();

		}
		System.out.printf("Average = " + getAverage(array));

	}

}
