import java.util.Scanner;

public class _01_RectangleArea {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		 input = new Scanner(System.in);
		 
		 int firstSide = input.nextInt();
		 int secondSide = input.nextInt();
		 
		 System.out.println(firstSide*secondSide);

	}

}
