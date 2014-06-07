import java.util.Scanner;


public class _03_PointsInsideAFigure {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
	    scan = new Scanner(System.in);
        String input = scan.nextLine();
        String arr[] = input.split(" ");
        double x = Double.parseDouble(arr[0]);
        double y = Double.parseDouble(arr[1]);
        
        if(y < 6 || y > 13.5) 
        	System.out.println("Outside");
        else
        {
                if(x < 12.5 || x > 22.5) 
                	System.out.println("Outside");
                else
                {
                        if(x > 17.5 && x < 20 && y > 8.5) 
                        	System.out.println("Outside");
                        else System.out.println("Inside");
                }
        }

	}

}
