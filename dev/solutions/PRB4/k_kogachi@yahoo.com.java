import java.util.Scanner;



public class PRB4 {
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
	
		for (int i = 0; i < x; i++) {
			String change = scan.next();
			char ay = change.charAt(0);
			if(ay == 'a' || ay == 'e' || ay == 'i' || ay == 'o' || ay == 'u'){
				System.out.println(change + "way");
			} else {
				System.out.println(change.substring(1) + ay + "ay");
			}
		}
	}

}
