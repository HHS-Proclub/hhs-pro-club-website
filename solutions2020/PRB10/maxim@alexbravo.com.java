import java.util.Scanner;

public class PRB10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] brokenLine = line.split("/");
		int a = Integer.parseInt(brokenLine[0]);
		int b = Integer.parseInt(brokenLine[1]);
		int gcf = 0;
		if(a == 0 || b == 0) gcf = a+b; // base case
		gcf = gcd(b,a%b);
		  
		  System.out.println(a/gcf + "/" + b/gcf);
	}
	
	public static int gcd(int a, int b)
	{
	  while(a!=0 && b!=0) // until either one of them is 0
	  {
	     int c = b;
	     b = a%b;
	     a = c;
	  }
	  return a+b; // either one is 0, so return the non-zero value
	}
}
