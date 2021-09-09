//Nicholas Tarn 9/10/13
import java.util.Scanner;
public class PRB1{
	public static void main(String[] args) {
		int a=0;
		Scanner k = new Scanner(System.in);
		int i=k.nextInt();
		for(int j=1;j<=i;j++){
			Scanner l = new Scanner(System.in);
			a+=l.nextInt();
		}
		a/=i;
		System.out.println(a);
	}
}