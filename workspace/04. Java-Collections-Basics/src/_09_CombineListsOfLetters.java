import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> firstList = new ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();
		for (char character : scan.nextLine().toCharArray()) {
		    firstList.add(character);
		}
		for (char character : scan.nextLine().toCharArray()) {
		    secondList.add(character);
		}
		ArrayList<Character> output = new ArrayList<>();
		output.addAll(firstList);
		for (int i = 0; i < secondList.size(); i++) {
		    if (!firstList.contains(secondList.get(i))) {
		//	output.add(' ');
			output.add(secondList.get(i));
		    }
		}
		for (char character : output) {
		    System.out.print(character);
		}
	}

}
