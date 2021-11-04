import java.util.Scanner;

public class PRA1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		long T = sc.nextLong();
		for (int i = 0; i < T; i++) {
			long currentTest = sc.nextLong();
			while (true) {
				long sumOfDigits = getSumOfDigits(currentTest); 
				if (GCD(currentTest, sumOfDigits) > 1) {
					System.out.println(currentTest);
					break;
				}
				currentTest++;
			}
		}
		
	}
	static long getSumOfDigits(long num) {
//		String number = num+"";
//		int sumOfDigits = 0;
//		for (int i = 0; i < number.length(); i++) {
//			int digit = number.charAt(i) - '0';
//			sumOfDigits += digit;
//		}
//		return sumOfDigits;
		long sumOfDigits = 0;
        
        while (num != 0)
        {
            sumOfDigits = sumOfDigits + num % 10;
            num = num/10;
        }
      
        return sumOfDigits;
	}
	
	static long GCD(long test, long sumOfDigits) {
		if (sumOfDigits == 0) {  
			return test; 
		}
		return GCD(sumOfDigits, test % sumOfDigits);   
		
	}

}
