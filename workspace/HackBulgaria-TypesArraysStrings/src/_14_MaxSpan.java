import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _14_MaxSpan {
	
	public static int maxSpan(int[] numbers){
		Map<Integer, Integer> first = new LinkedHashMap<Integer, Integer>(); // use TIntIntHashMap for efficiency.
	    int maxspan = 0;  // max span so far.
	    for (int i = 0; i < numbers.length; i++) {
	        int num = numbers[i];
	        if (first.containsKey(num)) {  // have we seen this number before?
	            int span = i - first.get(num) + 1;  // num has been  found so what is the span
	            if (span > maxspan) maxspan = span;  // if the span is greater, update the maximum.
	        } else {
	            first.put(num, i); // first occurrence of number num at location i.
	        }
	    }
	    return maxspan;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println(maxSpan(numbers));

	}

}
