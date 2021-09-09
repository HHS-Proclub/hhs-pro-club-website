import java.util.Arrays;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		String output = "";
		
		for (int a=0;a<times;a++) {
			int k = scan.nextInt();
			int num = scan.nextInt();
			int[] wood = new int[num];
			
			for(int b=0;b<num;b++) {
				wood[b] = scan.nextInt();
			}
			
			Arrays.sort(wood);
			
			if (num == 1) {
				output += 0+"\n";
			}
			if (num == 2) {
				output += k+"\n";
			}
			if (num > 2) {
				int result = k*(num-1);
				
				for (int c=2;c<num;c++) {
					result -= (c-1)*wood[c];
				}
				
				output += result+"\n";
			}
		}
		
		System.out.println(output);
		scan.close();
	}
}
