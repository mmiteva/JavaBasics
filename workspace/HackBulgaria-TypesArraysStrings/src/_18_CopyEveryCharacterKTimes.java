import java.util.Arrays;
import java.util.Scanner;


public class _18_CopyEveryCharacterKTimes {
	
	private static String copyEveryChar(String input, int k){
		 StringBuilder str = new StringBuilder();
		   for(int i = 0; i < k;i++) {
			   str.append(input);
		   }
		   return str.toString();
		}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int k = sc.nextInt();
		
		System.out.println(copyEveryChar(input, k));

	}

}
