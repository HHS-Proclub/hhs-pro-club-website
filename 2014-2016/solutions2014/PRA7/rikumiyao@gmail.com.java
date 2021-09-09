import java.util.*;
public class PRA7 {
	private static int[]cutsx;
	private static int[]cutsy;
	private static long[][]DP;
	private static final long MOD = 1000000007;
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		cutsx = new int[m-1];
		for(int x=0;x<m-1;x++){
			cutsx[x] = sc.nextInt();
		}
		Arrays.sort(cutsx);
		cutsy = new int[n-1];
		for(int x=0;x<n-1;x++){
			cutsy[x] = sc.nextInt();
		}
		Arrays.sort(cutsy);
		DP = new long[m][n];//min cost for size left
		for(int x=0;x<m;x++){
			for(int y=0;y<n;y++){
				DP[x][y] = -1;
			}
		}
		int x = 0;
		int y = 0;
		long result = 0;
		while(x<cutsx.length||y<cutsy.length){
//			System.out.println(result);
			int indexx = cutsx.length-x-1;
			int indexy = cutsy.length-y-1;
			
			long pricex = 0;
			if(indexx>=0){
				pricex = cutsx[indexx]*(y+1);
			}
			long pricey = 0;
			if(indexy>=0){
				pricey = cutsy[indexy]*(x+1);
			}
			if(pricex>pricey){
				result = (result+pricex)%MOD;
				x++;
			}
			else{
				result = (result+pricey)%MOD;
				y++;
			}
		}
		System.out.println(result);
	}
	
}
