import java.util.Arrays;
import java.util.Scanner;

public class PRB25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int[] arr = {a, b , c, d};
		int count;
		int min = 0x7fffffff;
		Arrays.sort(arr);
		for(int i = arr[0]; i<=arr[3]; i++){
			count = Math.abs(a-i)+Math.abs(b-i)+Math.abs(c-i)+Math.abs(d-i);
			if(count <= min){
				min = count;
			}
		
		}
		System.out.println(min);
		
	}

}
