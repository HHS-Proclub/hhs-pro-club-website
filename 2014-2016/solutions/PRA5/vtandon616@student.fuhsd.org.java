import java.util.Scanner;

public class PRA5 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		String idc = scanner.nextLine();
		int k = Integer.parseInt(scanner.nextLine());
		String fish = scanner.nextLine();
		for(int n = 0; n < k; n++){
			fish = idc;
			System.out.println((int)(Math.random() + 0.5));
			
		}
	}
}
