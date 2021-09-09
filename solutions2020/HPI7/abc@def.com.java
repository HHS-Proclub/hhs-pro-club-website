import java.util.*;
import java.awt.Point;

public class HPI7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x0 = sc.nextInt() - 1;
		int y0 = sc.nextInt() - 1;
		int x1 = sc.nextInt() - 1;
		int y1 = sc.nextInt() - 1;
		int[][] board = new int[N][N];
		board[x0][y0] = 1;
		ArrayDeque<Point> q = new ArrayDeque<Point>();
		q.add(new Point(x0, y0));
		while (!q.isEmpty()) {
			Point p = q.poll();
			int x = p.x;
			int y = p.y;
			int val = board[x][y]+1;
			tryPut(x+2, y+1, board, val, q);
			tryPut(x+1, y+2, board, val, q);
			tryPut(x-1, y+2, board, val, q);
			tryPut(x-2, y+1, board, val, q);
			tryPut(x-2, y-1, board, val, q);
			tryPut(x-1, y-2, board, val, q);
			tryPut(x+1, y-2, board, val, q);
			tryPut(x+2, y-1, board, val, q);
			if (board[x1][y1] != 0) break;
		}
		//System.out.println(java.util.Arrays.deepToString(board));
		System.out.println(board[x1][y1]-1);
	}
	static void tryPut(int x, int y, int[][] board, int val, ArrayDeque<Point> q) {
		if (inBounds(x, y, board.length) && board[x][y] == 0) {
			board[x][y] = val;
			q.add(new Point(x, y));
		}
	}
	static boolean inBounds(int x, int y, int N) {
		return x >= 0 && y >= 0 && x < N && y < N;
	}
}
