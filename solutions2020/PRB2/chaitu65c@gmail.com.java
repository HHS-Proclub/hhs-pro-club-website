import java.util.Scanner;
public class PRB2 {
	public static void main(String[] aew){
		Scanner h  =new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++){
			int n = h.nextInt();
			sum += n;
		}
		System.out.println(sum);
	}
}
