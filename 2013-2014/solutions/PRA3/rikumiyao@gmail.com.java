import java.util.Scanner;


public class PRA3 {
	private static boolean[][]grid;
	private static boolean[][]visited;
	private static int n;
	private static int count = 0;
	private static int c = 0;
	public static void main(String[]args){
		Scanner kboard = new Scanner(System.in);
		n = kboard.nextInt();
		kboard.nextLine();
		grid = new boolean[n][n];
		visited = new boolean[n][n];
		for(int x=0;x<n;x++){
			String input = kboard.nextLine();
			for(int y=0;y<n;y++){
				if(input.charAt(y)=='1'){
					grid[x][y] = true;
					count++;
				}
			}
		}
		recurse(0,0);
		recurse(n-1,n-1);
		recurse(0,n-1);
		recurse(n-1,0);
		System.out.println("NO");
	}
	public static void recurse(int x,int y){
		if(x<0||x>=n||y<0||y>=n){
			return;
		}
		if(visited[x][y]||!grid[x][y]){
			return;
		}
		c++;
		if(c==count){
			System.out.println("YES");
			System.exit(0);
		}
		visited[x][y] = true;
		recurse(x+1,y+2);
		recurse(x+1,y-2);
		recurse(x-1,y+2);
		recurse(x-1,y-2);
		recurse(x+2,y-1);
		recurse(x+2,y+1);
		recurse(x-2,y-1);
		recurse(x-2,y+1);
		c--;
		visited[x][y] = false;
	}
}
