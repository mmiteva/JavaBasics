import java.util.Scanner;

public class _03_LargestSequenceEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strArray = input.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int wordPosition = 0; 

		for (int i = 1; i < strArray.length; i++) {
			if (strArray[i].equals(strArray[i - 1])) {
				counterTemp++;
			} else {
				counterTemp = 1;
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				wordPosition = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(strArray[wordPosition] + " ");
		}
		System.out.println(strArray[wordPosition]);

	}

}
