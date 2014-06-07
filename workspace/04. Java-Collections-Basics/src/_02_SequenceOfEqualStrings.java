import java.util.Scanner;


public class _02_SequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strArray = input.split(" ");
		System.out.print(strArray[0]);
		
		
		for (int i = 1; i < strArray.length; i++) {
			if (strArray[i].equals(strArray[i-1])) {
				System.out.print(" " + strArray[i]);
			} else {
				System.out.println();
				System.out.print(strArray[i]);

			}
			
		}

	}

}
