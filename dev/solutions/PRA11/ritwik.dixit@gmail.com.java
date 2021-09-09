import java.util.Arrays;
import java.util.Scanner;


public class PRA11 {
	
	private static char[][] grid;
	
	//i hope this works
	public static void floodfill(int r, int c) {
		
		if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
			return;
		}
		
		if (grid[r][c] == '#') {
			return;
		}
		
		grid[r][c] = '#';
		
		floodfill(r + 1, c);
		floodfill(r, c + 1);
		floodfill(r, c - 1);
		floodfill(r - 1, c);
			
		
	}
	
	public static int win() {
		
		int count = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '.') {
					floodfill(i, j);
					count++;
				}
			}
		}
		
		System.out.println(count - 1);
		return count - 1;
	}
	
	public static void printArray() {
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		grid = new char[n][m];
		s.nextLine();
		 
		//get the input
		for (int i = 0; i < n; i++) {
			String stuff = s.nextLine();
			grid[i] = stuff.toCharArray();
		}
		
		win();
		
	}

}
