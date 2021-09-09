import java.util.Scanner;
public class PRA13 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long w = s.nextLong();
		long h = s.nextLong();
		long m = s.nextLong();
		long best = 0;
		long test = 0;
		long best1 = 0;
		long test1 = 0;
		for(int i = 0; i<w; i++){
			test = h*(w-i);
			if(test >= best && test <= m){
				best = test;
			}
		}
		for(long i = 0; i<h; i++){
			test1 = w*(h-i);
			if(test1 >= best1 && test1 <= m){
				best1 = test1;
			}
		}
		if(best>best1){
			System.out.println(best);
		} else {
			System.out.println(best1);
		}
	}

}
