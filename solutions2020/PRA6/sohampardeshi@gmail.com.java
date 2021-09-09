import java.util.Scanner;

public class PRA6 {
	public static void main(String[] Args){
		Scanner in = new Scanner(System.in);
		int c = Integer.parseInt(in.nextLine());
		for(int i = 0; i < c; i++){
			String l = in.nextLine().replaceAll("pi|ka|chu", "");
			System.out.println(l.length() == 0 ? "YES" : "NO");
		}
	}
}