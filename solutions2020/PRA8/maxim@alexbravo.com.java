import java.util.ArrayList;
import java.util.Scanner;

public class PRA8 {
	private static ArrayList<Integer> fibonaciPool = new ArrayList<Integer>();
	public static void main(String[] args){
		createFibonaciPool();
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] pool = new int[cases];
		for(int i = 0; i < cases; i++){
			pool[i] = sc.nextInt();
		}
		int[] result = new int[cases];
		for(int i = 0; i < cases; i++){
			System.out.println(getSmallestDifference(pool[i]));
		}
		
		
	}
	public static void createFibonaciPool(){
		fibonaciPool.add(0);
		fibonaciPool.add(1);
		fibonaciPool.add(1);
		int previous = 1;
		int justNow = 1;
		for(int i = 0; i < 30; i++){
			int n = previous + justNow;
			fibonaciPool.add(n);
			previous = justNow;
			justNow = n;
		}
	}
	public static int getSmallestDifference(int num){
		int prevDiff = 0;
		for(int current : fibonaciPool){
			int bigDiff = num - current;
			if(bigDiff < 0){
				return Math.min(prevDiff, Math.abs(bigDiff));
			} else if(bigDiff == 0){
				return 0;
			}
			prevDiff = bigDiff;
		}
		return -1;
	}
}
