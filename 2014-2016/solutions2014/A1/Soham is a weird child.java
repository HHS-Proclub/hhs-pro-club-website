import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A1 {

	private static int[][] items;
	private static double[] utilPerWeight;
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int weightLimit = Integer.parseInt(in.readLine());
		
		int n = Integer.parseInt(in.readLine());
		
		items = new int[n][2]; 
		utilPerWeight = new double[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int util = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			items[i] = new int[] {util,weight};
			utilPerWeight[i] = util/(weight+0.0);
		}
		
		int endUtility = 0;
		
		for(;;) {
			//Finds the largest UPW
			int maxUPWIndex = 0;
			for(int i = 0; i < utilPerWeight.length; i++) {
				if(utilPerWeight[maxUPWIndex] < utilPerWeight[i]){
					maxUPWIndex = i;
				}
			}
			
			if(items[maxUPWIndex][1] <= weightLimit){
				endUtility += items[maxUPWIndex][0];
				weightLimit -= items[maxUPWIndex][1];
				utilPerWeight[maxUPWIndex] = -1;
			} else if (hasItems(weightLimit)) {
				utilPerWeight[maxUPWIndex] = -1;
			} else {
				break;
			}
		}
		
		System.out.println(endUtility);
	}
	
	private static boolean hasItems(int weightLeft) {
		for(int i = 0; i < utilPerWeight.length; i++){
			if(utilPerWeight[i] != -1 && items[i][1] <= weightLeft) {
				return true;
			}
		}
		return false;
	}
}
