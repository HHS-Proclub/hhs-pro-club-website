import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VSA2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String test = kboard.nextLine();
		
		Pattern p = Pattern.compile("\\w+://[\\w./]+");
		Matcher m = p.matcher(test);
		boolean b = m.matches();
		System.out.println(b ? "YES" : "NO");

	}

}
