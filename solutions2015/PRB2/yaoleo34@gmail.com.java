import java.util.Scanner;

public class PRB2 {

	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		double r = 0;
		int a = kb.nextInt();
		if (a<=0){
			a=1;
		}
		int b = kb.nextInt();
		for(int i = a; i< b; i++){
			r+=i;
		}
		r= r/(b-a);
		System.out.println(r);
	}
}
