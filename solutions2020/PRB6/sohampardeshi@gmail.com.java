import java.util.Scanner;

public class PRB6 {

	public static void main(String[] Args){
		Scanner in = new Scanner(System.in);
		int h = 0, s = 0;
		
		for(int i = 0; i < 5; i++){
			int c = in.nextInt();
			h = (c > h) ? c : h;
			s += c;
		}
		
		if(s - h == h) System.out.println(h);
		else System.out.println(s);
	}
}