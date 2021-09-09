
import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int numCases = in.nextInt();
		String[] res = new String[numCases];
		for(int i = 0;i<numCases;i++) {
			int num = in.nextInt();
			if(isEmirp(num) == true) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		for(String s : res) {
			System.out.println(s);
		}
		
		//System.out.println(reverse("8378"));
	}
	
	public static boolean isEmirp(int n) {
		String s = n + "";
		int rev = Integer.parseInt(reverse(s));
		if(rev == n) {
			return false;
			
		}
		
		return isPrime(n) && isPrime(rev);
		
		
		
	}
	
	public static String reverse(String s) {
		
		StringBuffer sb = new StringBuffer(s);
		
//		if(s.length()%2 == 0) {
//			return null;
//		}else {
			for(int i = 0;i<s.length()/2;i++){
				sb.setCharAt(i, s.charAt(s.length()-1-i));
				sb.setCharAt(s.length()-1-i, s.charAt(i));
			}
			return sb.toString();
		//}
	}
	
	
	
	
	public static boolean isPrime(int n) {
		int midway = n/2 +1;
		if(n <2) {
			return false;
		}else if(n == 3) {
			return true;
		}
		for(int i =2;i<midway;i++) {
			if(n/((double)i) == (int)(n/((double)i))) {
				return false;
			}
		}
		
		
		return true;
	}

}
