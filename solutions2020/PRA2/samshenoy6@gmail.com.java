import java.util.Scanner;
public class PRA2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int numNums = s.nextInt();
		
		String finalAns = new String();
		
		for (; numNums > 0; numNums--) {
			int num = s.nextInt();
	        boolean isPrime = isPrime(num);
	        boolean isEmirp = false;
	        if (isPrime) {
	        	int reverse = reverseInteger(num);
	        	if (reverse != num)
	        		isEmirp = isPrime(reverse);
	        }
	        
	        if (isEmirp)
	        	finalAns += "YES\n";
	        else
	        	finalAns += "NO\n";
	        
		}
		
		System.out.println(finalAns);
		
	}
	
	public static int reverseInteger(int number) {
		boolean isNegative = number < 0 ? true : false;
		if (isNegative) {
			number = number * -1;
		}
		int reverse = 0;
		int lastDigit = 0;
		while (number >= 1) {

			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}
		return isNegative == true ? reverse * -1 : reverse;
	}
	
	private static boolean isPrime(int num) 
	{
	        if (num == 2) 
	            return true;
	        if (num < 2 || num % 2 == 0) 
	            return false;
	        for (int i = 3; i * i <= num; i += 2)
	            if (num % i == 0) 
	                return false;
	        return true;
	}



}
