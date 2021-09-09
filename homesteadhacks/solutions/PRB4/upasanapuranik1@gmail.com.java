import java.util.Scanner;
public class PRB4 {
	public static void main(String[] args) {
		Scanner check  = new Scanner(System.in);
		int i = check.nextInt();
		
		for(int x=0;x <i;x++) {
			int k = check.nextInt(); 
			if(k%2==0) {
				System.out.println("EVEN");
			}else {
				System.out.println("ODD");	
			}

		}
	}
}