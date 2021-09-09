import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(isPrime(nums[i]) && isPrime(reverse(nums[i])) && nums[i] != reverse(nums[i]))
					System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		

	}
	
	public static int reverse(int number)
    {  
        int result = 0;
        int remainder;
        while (number > 0)
        {
            remainder = number % 10;
            number = number / 10;
            result = result * 10 + remainder;
        }

        return result;
    }
	
	public static boolean isPrime(long n) {
	    // fast even test.
	    if(n > 2 && (n & 1) == 0)
	       return false;
	    // only odd factors need to be tested up to n^0.5
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) 
	            return false;
	    return true;
	}

}
