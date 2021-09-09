import java.util.Scanner;
public class PRA2 {
	public static String out = "";
	public static int CheckPalReverser(int thing) {
		String str = thing + "";
		String out = "";
		for(int i = str.length()-1; i >= 0 ; i--) {
			out += str.charAt(i);
		}
		if(Integer.parseInt(out) == thing) {
			return 4;
		}else {
			return Integer.parseInt(out);
		}
		
	}
	
	public static boolean isPrime(int thing) {
		for(int i=2; i < (thing/2)+1 ; i++ ) {
			if(thing%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		int tested;
		for(int i = 0; i< nums; i++) {
			tested = sc.nextInt();
			if(isPrime(tested)) {
				if(isPrime(CheckPalReverser(tested))) {
					out+= "YES\n";
				}else {
					out+= "NO\n";
				}
			}else {
					out+= "NO\n";
			}
			
		}
		
		System.out.print(out);
		sc.close();
		
	}

}
