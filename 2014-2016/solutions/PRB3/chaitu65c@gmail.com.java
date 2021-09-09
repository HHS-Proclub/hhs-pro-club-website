import java.util.Arrays;
import java.util.Scanner;
	public class PRB3 {
		public static void main(String[] agrs){
			Scanner h = new Scanner(System.in);
			int j = h.nextInt();
			int[] num = new int[j];
			int[] q = new int[j];
			for(int i=0; i<j; i++){
				int n = h.nextInt();
				num[i] = n;
			}
			Arrays.sort(num);
//			for(int i =0; i<j; i++){
//				q[i] = num[j]; 
//			}
			
			System.out.println(num[j-1]);
		}
}
