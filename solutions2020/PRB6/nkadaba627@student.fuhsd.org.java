import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		if(a>b&&a>c&&a>d&&a>e&&a==b+c+d+e) System.out.println(a);
		else if(b>a&&b>c&&b>d&&b>e&&b==a+c+d+e) System.out.println(b);
		else if(c>b&&c>a&&c>d&&c>e&&c==b+a+d+e) System.out.println(c);
		else if(d>b&&d>c&&d>a&&d>e&&d==b+c+a+e) System.out.println(d);
		else if(e>b&&e>c&&e>d&&e>a&&e==b+c+d+a) System.out.println(e);
		else System.out.println(a+b+c+d+e);
	}
}
