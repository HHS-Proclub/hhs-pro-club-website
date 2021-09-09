import java.util.Scanner;

public class PRB3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int x=0;x<n;x++){
			sum+=sc.nextInt();
		}
		System.out.println(sum/n);
	}
}