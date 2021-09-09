import java.util.Scanner;


public class PRA3 {

	static boolean[][] grid;
	static int trueSpots;
	static boolean yes=false, no=false;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		grid = new boolean[size][size];
		String line;
		for(int r=0;r<=grid.length-1;r++) {
			line = input.nextLine();
			for(int c=0;c<=grid.length-1;c++) {
				grid[r][c] = line.charAt(c) == '0' ? false : true;
				if (grid[r][c]) {
					trueSpots++;
				}
			}
		}
		if (trueSpots==0) {
			System.out.println("NO");
		}
		else {
			trueSpots-=1;
			if(!check(0,0,trueSpots) && !yes) { no=false; } 
			if(!check(0,grid.length-1,trueSpots) && !yes) { no=false; }
			if(!check(grid.length-1,0,trueSpots) && !yes) { no=false; }
			if(!check(grid.length-1,grid.length-1,trueSpots) && !yes) { no=false; }
			if(!yes) { System.out.println("NO"); }
		}
	}
	
	static boolean check(int r, int c, int trueSpots) {
		//System.out.println(r+""+c);
		if (trueSpots==0 && !yes && !no) {
			System.out.println("YES");
			yes=true;
			return true;
		}
		else {	
			if(r-2>=0 && c-1>=0) {
				if(grid[r-2][c-1]) {
					grid[r][c] = false;
					check(r-2,c-1,trueSpots-1);
				}
			}
			if(r-2>=0 && c+1<=grid.length-1) {
				if(grid[r-2][c+1]) {
					grid[r][c] = false;
					check(r-2,c+1,trueSpots-1);
				}
			}
			if(r-1>=0 && c-2>=0) {
				if(grid[r-1][c-2]) {
					grid[r][c] = false;
					check(r-1,c-2,trueSpots-1);
				}
			}
			if(r-1>=0 && c+2<=grid.length-1) {
				if(grid[r-1][c+2]) {
					grid[r][c] = false;
					check(r-1,c+2,trueSpots-1);
				}
			}
			if(r+1<=grid.length-1 && c-2>=0) {
				if(grid[r+1][c-2]) {
					grid[r][c] = false;
					check(r+1,c-2,trueSpots-1);
				}
			}
			if(r+1<=grid.length-1 && c+2<=grid.length-1) {
				if(grid[r+1][c+2]) {
					grid[r][c] = false;
					check(r+1,c+2,trueSpots-1);
				}
			}
			if(r+2<=grid.length-1 && c-1>=0) {
				if(grid[r+2][c-1]) {
					grid[r][c] = false;
					check(r+2,c-1,trueSpots-1);
				}
			}
			if(r+2<=grid.length-1 && c+1<=grid.length-1) {
				if(grid[r+2][c+1]) {
					grid[r][c] = false;
					check(r+2,c+1,trueSpots-1);
				}
			}
			if (!no && !yes) {
				no=true;
				return false;
			}
		}
		return false;
	}

}
