import java.util.*;
public class PRA3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean[][]grid = new boolean[m][n];
		recurse(grid,x,y);
		System.out.println(count==m*n);
	}
	private static int count = 0;
	public static void recurse(boolean[][]grid,int x, int y){
		if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]==true){
			return;
		}
		count++;
		grid[x][y] = true;
		recurse(grid,x+1,y+2);
		recurse(grid,x+1,y-2);
		recurse(grid,x-1,y+2);
		recurse(grid,x-1,y-2);
		recurse(grid,x+2,y+1);
		recurse(grid,x+2,y-1);
		recurse(grid,x-2,y+1);
		recurse(grid,x-2,y-1);
	}
}
