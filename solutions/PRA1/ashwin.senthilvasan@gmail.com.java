import java.util.Scanner;

public class PRA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resultGood = false;
        long T = sc.nextInt();
        
        for (long i = 0; i < T; i++) {
        	long N = sc.nextInt();
        	resultGood = false;
        	while(!resultGood)
        	{
        	long sum = 0;
        	long n1 = N; 
        	
        	for (long y = 0; y < n1; y++) {
        		sum += (n1 % 10);
        		n1 /= 10;
        	}
        	
        	long gcd = 1;
        	
        	for (int z = 1; z <= N && z <= sum; z++) {
               
        		if (N % z == 0 && sum % z == 0) {
                	gcd = z;
                }
            }
        	
        	if (gcd == 1) {
        		N++;
        	}
        	else
        	{
        	resultGood =true;
        	System.out.println(N);
        	}
        }   
      }
    }
}