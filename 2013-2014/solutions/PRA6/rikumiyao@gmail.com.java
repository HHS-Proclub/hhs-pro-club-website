import java.util.*;
public class PRA6 {
	public static int count = -1;
	public static char[][]grid;
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		grid = new char[m][n];
		for(int x=0;x<m;x++){
			String s = sc.nextLine();
			for(int y=0;y<n;y++){
				grid[x][y] = s.charAt(y);
			}
		}
		for(int x=0;x<m;x++){
			for(int y=0;y<n;y++){
				if(grid[x][y]=='.'){
					fill(x,y);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void fill(int x, int y){
		if(x<0||x>=grid.length||y<0||y>=grid[0].length||grid[x][y]=='#'){
			return;
		}
		grid[x][y] = '#';
		fill(x+1,y);
		fill(x-1,y);
		fill(x,y+1);
		fill(x,y-1);
	}
}
