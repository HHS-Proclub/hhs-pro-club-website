import java.util.Scanner;

public class PRB5 {

	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);

		String[] a = s.nextLine().split(" ");
		String[] b = s.nextLine().split(" ");
	
		System.out.println(l(a) + l(b));
	}
	public static int l(String[] arr){
		int m = -1;
		for(String s : arr){
			int i = Integer.parseInt(s);
			if(i % 10 == 0 && i > m) m = i;
		}
		return m;
	}
}
