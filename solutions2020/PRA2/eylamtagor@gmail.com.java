import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			int f = scan.nextInt();
			int b = getReverse(f);
			
			if (isPrime(f) && isPrime(b) && hasDistinctDigits(f) && f != b)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean isPrime(int x) {
		boolean result = true;
		for (int i = 2; i <= x / 2; ++i) {
			if (x % i == 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static int getReverse(int x) {
		String s = x + "";
		String result = "";
		
		for (int i = 1; i <= s.length(); i++) {
			result += s.charAt(s.length() - i);
		}
		
		return Integer.parseInt(result);
	}
	
	public static boolean hasDistinctDigits(int number) {
	    boolean returner = true;
	    int count = 1;
	    int newNum = number;
	    int digit = 0;

	    while (count < numDigits(number)) {         
	        while (count < numDigits(newNum)) {
	            digit = newNum % 10;
	            newNum/=10;
	            if (digit == getDigit(newNum, count)) {
	                returner = false;
	            }
	            count++;                
	        }
	        count++;
	    }
	    return returner;
	}

	public static int numDigits(int number) {
	    int count = 0;
	    while (number != 0) {
	        number /= 10;
	        count++;
	    }
	    return count;
	}

	public static int getDigit(int number, int i) {
	    int digit = 0;
	    int count = 0;
	    int originalNum = number;

	    while (count <= i) {
	        if (count == i) {
	            digit = number % 10;
	        }
	        number /= 10;
	        count++;
	    }
	    if (i > numDigits(originalNum)) {
	        return -1;
	    } else {
	        return digit;
	    }
	}

}
