import java.util.Scanner;
public class PRB4 {
	public static void main(String[] args){
		Scanner a =new Scanner(System.in);
		int n,d,g,h;
		n = a.nextInt();
		d = a.nextInt();
		g = a.nextInt();
		h = a.nextInt();
		int e = n+d+g+h;
		long product = 1;
		for(int i = 2; i<= e; i++){
			product *= i;
		}
		System.out.println(product);
	}
}
