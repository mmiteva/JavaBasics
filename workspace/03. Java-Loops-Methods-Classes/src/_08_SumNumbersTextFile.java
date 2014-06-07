import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersTextFile {

	public static void main(String[] args) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				"_08_Input.txt"))) {

			String line = fileReader.readLine();
			int totalSum = 0;

			System.out.print("Integer numbers:");
			while (line != null) {
				System.out.print(" " + line);
				totalSum += Integer.parseInt(line);
				line = fileReader.readLine();
			}
			System.out.println();
			System.out.println("Sum of the numbers: " + totalSum);

		} catch (IOException e) {
			System.out.println("Error");
		}

	}

}
