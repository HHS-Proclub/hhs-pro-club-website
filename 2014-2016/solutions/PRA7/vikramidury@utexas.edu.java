import java.util.Arrays;
import java.util.Scanner;

public class PRA7 {
	
	public static int[][] grid;
	public static int ways = 0;
	
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		grid = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				grid[i][j] = kboard.nextInt();
			}
		}
		dfs(0, 0, n-1, n-1);
		System.out.println(ways);
	}
	
	public static void dfs(int r, int c, int destr, int destc){
		if (r == destr && c == destc){
			ways++;
			return;
		} else if (r < 0 || c < 0 || r >= grid[0].length || c >= grid.length){
			return;
		} else if (grid[r][c] == 1){
			return;
		}
		grid[r][c] = 1;
		dfs(r + 1, c, destr, destc);
		dfs(r - 1, c, destr, destc);
		dfs(r, c + 1, destr, destc);
		dfs(r, c - 1, destr, destc);
		grid[r][c] = 0;

	}
}
