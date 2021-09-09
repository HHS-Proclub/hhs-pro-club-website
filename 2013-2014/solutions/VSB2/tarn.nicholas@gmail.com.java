import java.util.Scanner;
public class VSB2 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int m = kboard.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(i*m);
		}

	}

}
