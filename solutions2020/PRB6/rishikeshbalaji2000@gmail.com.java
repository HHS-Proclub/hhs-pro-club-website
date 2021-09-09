import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		int[] data = new int[5];
		data[0] = a;
		data[1] = b;
		data[2] = c;
		data[3] = d;
		data[4] = e;
		int x = data[0] + data[1] + data[2] + data[3] + data[4];
		for(int i = 0; i < 5 ; i ++){
			if(data[i] == x - data[i]){
				System.out.println(data[i]);
				return;
			}
		}
		System.out.println(x);
		
		
	}
}
