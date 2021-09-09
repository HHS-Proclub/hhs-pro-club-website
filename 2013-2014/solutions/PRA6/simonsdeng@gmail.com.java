import java.util.Scanner;

public class PRA6 {

	private static int N;
	private static int M;
	private static boolean[][] barnWalls;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		in.nextLine();
		barnWalls = new boolean[N][M];
		
		for (int y = 0; y < M; y++) {
			final String s = in.nextLine();
			for (int x = 0; x < N; x++) {
				barnWalls[x][y] = (s.charAt(x) == '#');
			}
		}
		in.close();
		
		int count = -1;
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < M; y++) {
				if (!barnWalls[x][y]) {
					floodFill(x, y);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	private static void floodFill(int x, int y) {
		if (x < 0 || x >= N || y < 0 || y >= M || barnWalls[x][y]) {
			return;
		}
		
		barnWalls[x][y] = true;
		
		floodFill(x - 1, y);
		floodFill(x + 1, y);
		floodFill(x, y - 1);
		floodFill(x, y + 1);
	}

}
