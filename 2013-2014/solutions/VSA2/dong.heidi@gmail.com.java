import java.util.Scanner;


public class VSA2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String url = input.nextLine();
		if(url.contains("://") && !url.startsWith("://") && !url.endsWith("://")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
			
	}

}
