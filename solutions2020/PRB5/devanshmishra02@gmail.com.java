import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long x = input.nextInt();
        for(int i = 0; i < x; i++) {
        	long n = input.nextInt();
        	long count = n;
        	long k = input.nextInt();
        	long check = (long) Math.pow(10, k);
        	while(count % check != 0) {
        		count += n;
        	}
        	System.out.println(count);
        }
        input.close();
	}
}
