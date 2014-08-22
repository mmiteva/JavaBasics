import java.util.Scanner;

public class _06_DoubleFactorial {

	private static long doubleFac(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * doubleFac(n - 2);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.println(doubleFac(n));

	}

}
