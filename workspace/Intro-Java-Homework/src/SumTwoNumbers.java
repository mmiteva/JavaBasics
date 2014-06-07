import java.util.Scanner;

public class SumTwoNumbers {

	private static Scanner input; 
	
    public static void main(String[] args) {
		input = new Scanner(System.in);
	
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a + b);
		
	}

}
