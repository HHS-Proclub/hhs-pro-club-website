import java.util.Scanner;

public class PRB4 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		for(int x = 0; x < j ; x ++){
			
			System.out.println(i + (x * i));
		}
		
	}
}
