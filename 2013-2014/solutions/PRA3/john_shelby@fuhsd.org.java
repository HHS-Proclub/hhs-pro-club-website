import java.util.Scanner;


public class PRA3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int n = Integer.parseInt(key.nextLine());
		boolean[][] board = new boolean[n][n];
		int total = 0;
		for(int i = 0; i < n; i++) {
			String line = key.nextLine();
			for(int j = 0; j < line.length(); j++)
				if (line.charAt(j) == '1') {
					board[i][j] = true;
					total++;
				}
		}
		
		boolean answer = false;
		for (int i = 0; i < n && !answer; i++) {
			for (int j = 0; j < n && !answer; j++) {
				if (board[i][j]) {
					 answer = tour(board,i,j,total);
				}
			}	
		}
		System.out.println(answer ? "YES" : "NO");

	}
	
	public static boolean tour(boolean[][] board, int x, int y, int total) {
		if (total == 1)
			return true;
		total--;
		board[x][y] = false;
		int[][] moves = new int[8][2];
		moves[0][0] = moves[1][0] = x-2;
		moves[2][0] = moves[3][0] = x+2;
		moves[4][0] = moves[5][0] = x-1;
		moves[6][0] = moves[7][0] = x+1;
		moves[4][1] = moves[6][1] = y-2;
		moves[5][1] = moves[7][1] = y+2;
		moves[1][1] = moves[3][1] = y-1;
		moves[0][1] = moves[2][1] = y+1;
		for(int i = 0; i < 8; i++) {
			if (onBoard(board,moves[i]) && board[moves[i][0]][moves[i][1]]) {
				if (tour(board,moves[i][0],moves[i][1],total))
					return true;
			}
		}
		board[x][y] = true;
		return false;
	}
	
	public static boolean onBoard(boolean[][] board, int[] move) {
		if (move[0] >= 0 && move[0] < board.length && move[1] >= 0 && move[1] < board[move[0]].length)
			return true;
		return false;
	}

}
