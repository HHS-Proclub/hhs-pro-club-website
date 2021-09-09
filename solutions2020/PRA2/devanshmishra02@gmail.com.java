import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			long x = scan.nextLong();
			boolean isGood = false;
			if(check(x)) {
				String xStr = x +"";
				String str = "";
				for(int j = xStr.length()-1; j>= 0; j--) {
					str +=xStr.substring(j, j+1);
				}
				long x2 = Long.parseLong(str);
				if(x2 != x && check(x2)) {
					isGood = true;
				} else {
					isGood = false;
				}
			} else {
				isGood = false;
			}
			if(isGood) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	public static boolean check(long x) {
		long temp;
		
		for(long i=2;i<=x/2;i++)
		{
	           temp=x%i;
		   if(temp==0)
		   {
		     return false;
		   }
		}
		return true;
	}
}
