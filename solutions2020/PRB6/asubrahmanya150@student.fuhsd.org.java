import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int out = in.nextInt();
		int a;
		for(int i = 0; i < 4; i++){
			a = in.nextInt();
			if(a>out){
				out = a;
			}
		}
		System.out.println(out);
	}
}
