import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    	int times = in.nextInt();
    	
 
    	int number = in.nextInt();
    	for (int i = 0; i != times; i++) {
    		number = number % 2;
    		if (number == 1) {
    		System.out.println("ODD");
    		}
    		
    		else {
    		System.out.println("EVEN");
    		}
    	
	}
}
}
