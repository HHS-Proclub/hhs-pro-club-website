import java.util.Scanner;

public class PRB12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = Integer.parseInt(s.nextLine());
		for(int i = 0; i < len; i++){
			String tmp = s.nextLine();
			System.out.println(tmp.substring(0, tmp.length() / 2));
		}	
	}
}