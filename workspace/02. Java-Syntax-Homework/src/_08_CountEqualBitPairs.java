import java.util.Scanner;

public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int leadingZeroes = Integer.numberOfLeadingZeros(number);
		int indexLastBit = 31 - leadingZeroes;

		int countEqualBitPairs = 0;
		for (int i = 0; i < indexLastBit; i++) {
			int mask01 = 1 << i;
			int mask02 = 1 << (i + 1);

			Boolean cond01 = (number & mask01) == mask01;
			Boolean cond02 = (number & mask02) == mask02;

			Boolean cond03 = cond01 ^ cond02;
			if (!cond03) {
				countEqualBitPairs++;
			}
		}
		System.out.println(countEqualBitPairs);

		input.close();

	}

}
