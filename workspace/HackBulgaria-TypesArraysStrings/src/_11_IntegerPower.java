import java.util.Scanner;


public class _11_IntegerPower {
	
	public static long pow(int a, int b){
		long c = (long) Math.pow(a, b);
		
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(pow(a, b));

	}

}
