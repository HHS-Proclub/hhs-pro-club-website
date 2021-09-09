import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB7 {

	public static void main (String[] args){
		Scanner kboard = new Scanner(System.in);
		StringTokenizer input = new StringTokenizer(kboard.nextLine(), " ,");
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (input.hasMoreTokens()){
			list.add(Integer.parseInt(input.nextToken()));
		}
		int clumps = 0;
		
		int run = 0;
		int prev = list.get(0)+1;
		list.add(0);
		for(Integer i: list){
			if (i == prev){
				run++;
			} else {
				if (run > 0){
					clumps++;
				}
				run = 0;
			}
			prev = i;
		}
		System.out.println(clumps);
	}
	
}
