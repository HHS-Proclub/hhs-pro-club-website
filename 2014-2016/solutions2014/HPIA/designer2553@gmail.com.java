import java.util.*;

public class HPIA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
//		int num;
		
//		if (args.length > 0 && args[0] != null) {
//			num = Integer.parseInt(args[0]);
//		} else {
//			throw new IllegalArgumentException ("There must be something in the array");
//		}
		
		int maxDivisor = -1;
		int minDivisor = -1;
		
//		for (int i = 2; i < num / 3 + 1; i++) {
//			if (num % i == 0) {
//				if (minDivisor == -1) {
//					minDivisor = i;
//				}
//				
//				maxDivisor = num / i;
//				break;
//			}
//		}
		
		if ((num & 1) == 0) {
			minDivisor = 2;
			maxDivisor = num / minDivisor;
		} else {
			for (int i = 3; i < (int)(Math.sqrt(num) + 1); i += 2) {
				if (num % i == 0) {
					if (minDivisor == -1) {
						minDivisor = i;
					}
					
					maxDivisor = num / i;
					break;
				}
			}
		}
		
		System.out.println(maxDivisor + "\n" + minDivisor);
	}

}
