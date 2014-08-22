import java.util.Scanner;


public class _18_isPalindrome {
	
	private static boolean isPalindrome(String argument) {
		String pal = argument.replaceAll("[^a-zA-Z0-9]", "");
		  return pal.equalsIgnoreCase((new StringBuilder(pal)).reverse().toString());		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String argument = input.nextLine();
		
		System.out.println(isPalindrome(argument));

	}

}
