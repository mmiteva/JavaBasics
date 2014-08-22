//
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//public class _24_AnagramSubstring {
//	
//	static boolean hasAnagramOf(String A, String B) {
//		if (B.length() < A.length()){
//			return false;
//		} 
//
//		  char[] arr = A.toCharArray();
//		  Arrays.sort(arr);
//		  
//
//		  for (int i = 0; i <= B.length() - A.length(); i++)
//		  {
//		    String substr = B.substring(i, A.length());
//		    char[] subArray = substr.toCharArray();
//		    substr = new String(subArray);
//
//		   
//				
//			}
//		    	return true;
//		    } 
//		  }
//
//		  return false;
//		}
//		
//		
//	
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String A = input.nextLine();
//		String B = input.nextLine();
//		
//		System.out.println(hasAnagramOf(A, B));
//
//	}
//
//}
