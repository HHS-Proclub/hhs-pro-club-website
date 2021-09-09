import java.util.Scanner;

public class PRB5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		for(int x=0;x<n;x++){
			int num = sc.nextInt();
			if(max<num)
				max = num;
		}
		System.out.println(max);
	}
}
