import java.util.Scanner;


public class PRA3 {

	static boolean hasKnightTour(int[][] board, int row, int col, int openSquares)
	{
		if(openSquares == 1)
		{
			return true;
		}
		
		board[row][col] = 0;
		if(row-2 >= 0 && col-1 >=0 && board[row-2][col-1] == 1 && hasKnightTour(board, row-2, col-1, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row-2 >= 0 && col+1 < board.length && board[row-2][col+1] == 1 && hasKnightTour(board, row-2, col+1, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row+2 < board.length && col-1 >=0 && board[row+2][col-1] == 1 && hasKnightTour(board, row+2, col-1, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row+2 < board.length && col+1 < board.length && board[row+2][col+1] == 1 && hasKnightTour(board, row+2, col+1, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row-1 >= 0 && col-2 >=0 && board[row-1][col-2] == 1 && hasKnightTour(board, row-1, col-2, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row-1 >= 0 && col+2 < board.length && board[row-1][col+2] == 1 && hasKnightTour(board, row-1, col+2, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row+1 < board.length && col-2 >=0 && board[row+1][col-2] == 1 && hasKnightTour(board, row+1, col-2, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		else if(row+1 < board.length && col+2 < board.length && board[row+1][col+2] == 1 && hasKnightTour(board, row+1, col+2, openSquares-1))
		{
			board[row][col] = 1;
			return true;
		}
		
		board[row][col] = 1;
		
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] board;
		
		int dim = s.nextInt();
		s.nextLine();
		board = new int[dim][dim];
		int opencount = 0;
		for(int i = 0; i < dim; i++)
		{
			String num = s.nextLine();
			for (int j = 0; j < dim; j++)
			{
				board[i][j] = num.charAt(j) - '0';
				if(board[i][j] == 1)
				{
					opencount++;
				}
			}
		}
		
		for(int i = 0; i < dim; i++)
		{
			for (int j = 0; j < dim; j++)
			{
				if(board[i][j] == 1)
				{
					board[i][j] = 0;
					if(hasKnightTour(board, i, j, opencount))
					{
						System.out.println("YES");
						return;
					}
				}
			}
		}
		
		System.out.println("NO");
		
	}

}
