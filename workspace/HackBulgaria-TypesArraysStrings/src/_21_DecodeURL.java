import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

public class _21_DecodeURL {

	private static String decodeUrl(String input)
			throws UnsupportedEncodingException {
		String decodedStr = URLDecoder.decode(input, "UTF-8");
		return decodedStr;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(decodeUrl(input));

	}

}
