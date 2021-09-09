import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA9 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numInputs = Integer.parseInt(s.nextLine());
		String input = s.nextLine();
		StringTokenizer stringthing = new StringTokenizer(input);
		int[] costs = new int[numInputs];
		for(int i = 0; i < numInputs; i++){
			try{
			costs[i] = Integer.parseInt(stringthing.nextToken());
			}catch(NumberFormatException e){
				
			}
		}
		Arrays.sort(costs);
		long bill  = 0;
		int numGroups = costs.length/ 4;
		int[][] groups = new int[numGroups][4];
		for(int i = 0 ; i < numGroups; i++){
			groups[i][0] = costs[costs.length -1- i*4];
			groups[i][1] = costs[costs.length -1- i*4 - 1];
			groups[i][2] = costs[costs.length -1- i*4 - 2];
			groups[i][3] = costs[costs.length -1- i*4 - 3];
		}
		int q;
		if(costs.length%4 == 3){
			q = 2;
		}else{
			q = costs.length%4;
		}
		for(int i = 0 ; i < q; i++){
			bill += costs[i];
		}
		for(int i = 0 ; i < groups.length; i++){
				bill += groups[i][0];
				bill += groups[i][1];
		}
		System.out.println(bill);
	}
}
