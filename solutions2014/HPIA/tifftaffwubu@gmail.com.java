import java.util.Scanner;

public class HPIA {
	
	
	public static int smallestDivisor(int n){
		int end = (int)Math.ceil(Math.sqrt(n));
		int low = -1;
		for (int i = 2; i < end ; i++)
		{
			if (n%i == 0)
			{
				low = i;
				break;
			}
		}
		return low;
	}
	
	public static int largestDivisor(int sd, int n){	
		int ld = (n/sd);
		return ld;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = smallestDivisor(n);
		if (x != -1)
		{
			System.out.println(largestDivisor(x,n));
			System.out.println(x);
		}
			
		else
		{
			System.out.println(-1);
			System.out.println(-1);
		}
		
		scan.close();
	}
}
//Tiffany Wu