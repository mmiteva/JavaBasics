import java.util.Scanner;

public class _02_isNPrime {

	private static boolean isPrime(int N) {
		if (N <= 1) {
			return false;
		}
		if (N == 2) {
			return true;
		}
		if (N % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(N) + 1; i = i + 2) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		System.out.println(isPrime(N));
	}

}
