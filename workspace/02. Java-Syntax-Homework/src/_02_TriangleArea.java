import java.util.Scanner;

public class _02_TriangleArea {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		int Ax = input.nextInt();
		int Bx = input.nextInt();
		int Ay = input.nextInt();
		int By = input.nextInt();
		int Cx = input.nextInt();
		int Cy = input.nextInt();

		double distanceAB = Math.sqrt(((Ax - Bx) * (Ax - Bx) + (Ay - By)
				* (Ay - By)));
		double distanceAC = Math.sqrt(((Ax - Cx) * (Ax - Cx) + (Ay - Cy)
				* (Ay - Cy)));
		double distanceBC = Math.sqrt(((Bx - Cx) * (Bx - Cx) + (By - Cy)
				* (By - Cy)));

		double halfPerimeter = (distanceAB + distanceAC + distanceBC) / 2;

		double area = Math.sqrt((halfPerimeter * (halfPerimeter - distanceAB)
				* (halfPerimeter - distanceAC) * (halfPerimeter - distanceBC)));

		if (distanceAC + distanceBC > distanceAB
				&& distanceAB + distanceAC > distanceBC
				&& distanceBC + distanceAB > distanceAC) {

			System.out.printf("%.0f", Math.abs(area));
		} else {

			System.out.println(0);

		}

	}

}
