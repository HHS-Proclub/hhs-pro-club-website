import java.util.Scanner;

public class PRA13 {
	private static long W;
	private static long H;
	private static long M;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		W = sc.nextLong();
		H = sc.nextLong();
		M = sc.nextLong();
		
		System.out.println(findHighestAreaPossible());
	}
	public static long findHighestAreaPossible(){
		if(W*H <= M){
			return W*H;
		} else {
			return Math.max(getHighestSquare(), Math.max(getHighestHeight(), getHighestWidth()));
		}
	}
	public static long getHighestSquare(){
		if(H>W){
			for(long i = W; i > 0; i--){
				if(Math.pow(i, 2) <= M){
					return i*i;
				}
			}
		} else {
			for(long i = H; i > 0; i--){
				if(Math.pow(i, 2) <= M){
					return i*i;
				}
			}
			
		}
		long random = 0;
		return random;
		
	}
	public static long getHighestWidth(){
		for(long i = W; i > 0; i--){
			if(i*H <= M){
				return i*H;
			}
		}
		return 0;
	}
	public static long getHighestHeight(){
		for(long i = H; i > 0; i--){
			if(i*W <= M){
				return i*W;
			}
		}
		return 0;
	}
}
