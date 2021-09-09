import java.util.Scanner;
public class PRA5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();
		int highest = 0;
		int y = N*A/(A+B);
		int x = N - y;
		if(y*B >= x*A){
			highest = x*A;
			if ((y-1)*B >= (x+1)*A){
				highest = (x+1)*A;
			}
		} else {
			highest = y*B;
			if ((y+1)*B < (x-1)*A){
				highest = (y+1)*B;
			} 
			else if((x-1)*A> highest){
				highest = (x-1)*A;
			}
		}
		System.out.println(highest);
		
	}
	
}