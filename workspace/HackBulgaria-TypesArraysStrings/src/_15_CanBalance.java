import java.util.Scanner;

public class _15_CanBalance {

	public static boolean canBalance(int[] numbers) {
		int firstSum = 0;
		int secondSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			firstSum = 0;
			secondSum = 0;

			for (int j = 0; j <= i; j++)
				firstSum = firstSum + numbers[j];

			for (int k = i + 1; k < numbers.length; k++)
				secondSum = secondSum + numbers[k];

			if (firstSum == secondSum)
				return true;
			else
				continue;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println(canBalance(numbers));

	}

}
