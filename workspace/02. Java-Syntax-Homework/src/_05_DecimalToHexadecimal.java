import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int variable = input.nextInt();
		System.out.println(Integer.toHexString(variable).toUpperCase());

		input.close();

	}

}
