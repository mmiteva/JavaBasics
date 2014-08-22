import java.util.Scanner;

public class _18_ReverseEachWordString {

	private static String reverseEveryChar(String arg) {
		StringBuilder strBuilder = new StringBuilder();
		char[] charArr = arg.toCharArray();
		
		for (int i = charArr.length - 1; i >= 0; i--) {
			strBuilder.append(charArr[i]);
		}
		
		return strBuilder.toString();
	}
		

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String arg = input.nextLine();

		System.out.println(reverseEveryChar(arg));
	}

}
