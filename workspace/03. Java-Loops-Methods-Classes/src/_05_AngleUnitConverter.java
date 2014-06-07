import java.util.Scanner;


public class _05_AngleUnitConverter {

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int n = Integer.parseInt(input.nextLine());
			for (int i = 0; i < n; i++) {
				String[] tokens = input.nextLine().split("\\s");
				Double num = Double.parseDouble(tokens[0]);
				if(tokens[1].contentEquals("rad")){
					System.out.printf("%.6f",Math.toDegrees(num));
				}
				else {
					System.out.printf("%.6f",Math.toRadians(num));
				}
			}
			input.close();
		}
}
		
	