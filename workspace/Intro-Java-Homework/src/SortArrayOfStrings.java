import java.util.ArrayList;
import java.util.Scanner;


public class SortArrayOfStrings {
	
	private static Scanner input; 

	public static void main(String[] args) {
		input = new Scanner(System.in);
	
		int number = input.nextInt();
		ArrayList<String> allStrings = new ArrayList<String>();
		for (int i = 0; i <= number - 1; i++) {
			String name = input.next();
			allStrings.add(name);
		}
		
		allStrings.sort(null);
		System.out.println(allStrings);

	}

}
