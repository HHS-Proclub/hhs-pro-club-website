import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class PRA7 {
	private static int n, count = 0;
	private static boolean[][] grid;
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(read.readLine());
		grid = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(read.readLine());
			for (int j = 0; j < n; j++) {
				if (Integer.parseInt(token.nextToken()) == 1) {
					grid[i][j] = true;
				} else {
					grid[i][j] = false;
				}
			}
		} 
		dfs(0, 0, grid);
		OutputStream out = new BufferedOutputStream(System.out);
		out.write((count+"").getBytes());
		out.flush();
	}
	public static void dfs(int x, int y, boolean[][] moveGrid) {
		if (x < 0 || x >= n || y < 0 || y >= n) {
			return;
		}
		
		if (moveGrid[x][y]) {
			return;
		}
		
		if (x == n - 1 && y == n - 1) {
			count++;
			return;
		} 
		
		moveGrid[x][y] = true;
		/*System.out.println(x + " " + y);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(moveGrid[i][j] + " ");
			}
			System.out.println();
		}*/
		dfs(x - 1, y, moveGrid);
		dfs(x + 1, y, moveGrid);
		dfs(x, y - 1, moveGrid);
		dfs(x, y + 1, moveGrid);
		moveGrid[x][y] = false;
	}
}
