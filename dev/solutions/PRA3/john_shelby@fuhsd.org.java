import java.util.Scanner;


public class PRA3 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int m = kboard.nextInt();
		int n = kboard.nextInt();
		int x = kboard.nextInt();
		int y = kboard.nextInt();
		boolean[][] board = new boolean[m][n];
		System.out.println(travel(board,x,y,0));
	}
	
	public static boolean travel(boolean[][] board, int x, int y, int total) {
		if (x < 0)
			return false;
		else if (x >= board.length)
			return false;
		else if (y < 0)
			return false;
		else if (y >= board[x].length)
			return false;
		if (board[x][y] == true)
			return false;
		
		board[x][y] = true;
		
		total++;
		if (total == board.length * board[x].length)
			return true;
		
		
		boolean out = travel(board, x+1, y+2, total) || 
				travel(board, x-1, y+2, total) ||
				travel(board, x+1, y-2, total) ||
				travel(board, x-1, y-2, total) ||
				travel(board, x+2, y+1, total) ||
				travel(board, x-2, y+1, total) ||
				travel(board, x+2, y-1, total) ||
				travel(board, x-2, y-1, total);
		
		board[x][y] = false;
		
		return out;
		
	}

}
