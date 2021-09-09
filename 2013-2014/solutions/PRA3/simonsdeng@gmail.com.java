import java.util.Scanner;

public class PRA3 {
	
	private static int N;
	private static boolean[][] grid;
	private static int count;

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		N = in.nextInt();
		in.nextLine();
		
		grid = new boolean[N][N];
		for (int x = 0; x < N; x++) {
			final String s = in.nextLine();
			for (int y = 0; y < N; y++) {
				if (s.charAt(y) == '1') {
					grid[x][y] = true;
					count++;
				}
			}
		}
		
		in.close();
		
		System.out.println((dfs(0, 0)
				|| dfs(N - 1, 0)
				|| dfs(0, N - 1)
				|| dfs(N - 1, N - 1)) ? "YES" : "NO");
	}
	
	private static boolean dfs(int x, int y) {
		if (x < 0 || x >= N || y < 0 || y >= N) {
			return false;
		} else if (!grid[x][y]) {
			return false;
		}
		
		grid[x][y] = false;
		count--;
		
		if (count <= 0) {
			return true;
		}
		
		if (dfs(x - 2, y - 1)
				|| dfs(x - 2, y + 1)
				|| dfs(x - 1, y - 2)
				|| dfs(x - 1, y + 2)
				|| dfs(x + 1, y - 2)
				|| dfs(x + 1, y + 2)
				|| dfs(x + 2, y - 1)
				|| dfs(x + 2, y + 1)) {
			return true;
		}
		
		grid[x][y] = true;
		count++;
		return false;
	}

}
