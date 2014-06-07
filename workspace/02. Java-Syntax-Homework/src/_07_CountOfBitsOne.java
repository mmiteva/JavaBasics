import java.util.Scanner;

public class _07_CountOfBitsOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int bitsCount = Integer.bitCount(number);

		System.out.println(bitsCount);

		input.close();

	}

}
