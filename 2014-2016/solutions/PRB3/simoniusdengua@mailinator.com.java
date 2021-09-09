import java.util.Scanner;

public class PRB3 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		int j = Integer.MIN_VALUE;
		int a = s.nextInt();
		for(int i = 0; i < a; i++){
			int p = s.nextInt();
			if(p > j) j = p;
		}
		System.out.println(j);
	}
}