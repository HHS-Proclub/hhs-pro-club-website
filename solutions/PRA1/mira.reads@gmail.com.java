import java.util.*; 
public class PRA1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		ArrayList<Long> answers = new ArrayList<Long>(); 
		long i = scan.nextInt();
		for(int k = 0; k< i; k++) {
			long num = scan.nextInt(); 
			long n = num; 
			int count = 0; 
			while (n != 0) {
	            n = n / 10;
	            ++count;
	        }
			n = num;
			while(n<= Long.MAX_VALUE) {
				if(shareGCD(n, count)) {
					answers.add(n);
					break; 
				}
				else {
					n++; 
				}
			}
			
		}
		for(int l = 0; l< answers.size(); l++) {
			System.out.println(answers.get(l)); 
		}

	}
	public static boolean shareGCD(long num, int digit) {
	//	System.out.println(num + " ");
		long sumDigits = 0;
		long clone = num; 
		int cdigit = 1; 
		while(cdigit<=digit) {
			cdigit++; 
			//break; 
			sumDigits += clone%10; 
		//	clone -= clone%10;
			clone/=10; 
		}
		sumDigits = Math.round(sumDigits);
		//System.out.println(sumDigits);
		for(int l = 2; l<= num/2; l++) {
			if(Math.round(num%l) == Math.round(sumDigits%l) && Math.round(num%l) ==0) {
				return true; 
			}
		}
		return false; 
	}

}
