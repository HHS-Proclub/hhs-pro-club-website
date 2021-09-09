import java.util.Arrays;
import java.util.Scanner;


public class PRA19 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[] arr = new int[m];
		for(int i = 0; i < m; i++)
			arr[i] = s.nextInt();
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length - n] + " " + arr[n - 1]);
	}
}
