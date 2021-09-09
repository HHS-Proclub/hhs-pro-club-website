import java.util.Scanner;
public class PRB17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
	
		
		int x = s.nextInt();
		int max = s.nextInt();
		int total = half(x, max);
		System.out.println(total);
			
		
	}
	public static int half(int x, int max){
		if(x <= max){
			return 1;
		} else {
			return half(x/2, max) + half(x - x/2, max); 
		}
	}

}
