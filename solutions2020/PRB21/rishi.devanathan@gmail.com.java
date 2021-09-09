import java.util.Arrays;
import java.util.Scanner;
public class PRB21 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i = 0; i<3; i++){
			arr[i] = in.nextInt();
		}
		
		int n = in.nextInt();
		int result = 0;
		
		for(int i = 0; i < n; i++){
			Arrays.sort(arr);
			result+=arr[arr.length-1];
			arr[arr.length-1]--;
		}
		System.out.println(result);
		
	}

}
