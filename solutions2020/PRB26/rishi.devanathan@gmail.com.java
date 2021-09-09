import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();

		while(in.hasNextLine()) {

			StringTokenizer token = new StringTokenizer(in.nextLine());
			ArrayList<Integer> inputs = new ArrayList<>();
			while (token.hasMoreTokens()) {
				int bars = Integer.parseInt(token.nextToken());
				inputs.add(bars);
			}
			System.out.println(solve(inputs));


		}
	}
	private static int solve(ArrayList<Integer> list){

		int max = 0;
		for(int x = Collections.max(list); x>=1; x--){
			for(int y = 1; y<=Collections.max(list); y++){

				if(list.contains(x-y) && list.contains(x+y)){
					if(max < x*y){
						max = x*y;
					}
				}
			}
		}
		return max;
	}

}



