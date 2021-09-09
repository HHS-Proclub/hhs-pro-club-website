import java.util.*;
public class CS4 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]grid = new int[n][n];
		int total = 0;
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				grid[x][y] = sc.nextInt();
				total+=grid[x][y];
			}
		}
		if(total%n!=0){
			System.out.println("no");
			return;
		}
		int sum = total/n;
		for(int x=0;x<n;x++){
			int tempsum = 0;
			for(int y=0;y<n;y++){
				tempsum+=grid[x][y];
			}
			if(tempsum!=sum){
				System.out.println("no");
				return;
			}
		}
		for(int x=0;x<n;x++){
			int tempsum = 0;
			for(int y=0;y<n;y++){
				tempsum+=grid[y][x];
			}
			if(tempsum!=sum){
				System.out.println("no");
				return;
			}
		}
		int diagsum = 0;
		for(int x=0;x<n;x++){
			diagsum+=grid[x][x];
		}
		if(diagsum!=sum){
			System.out.println("no");
			return;
		}
		int diagsum1 = 0;
		for(int x=0;x<n;x++){
			diagsum1+=grid[n-x-1][x];
		}
		if(diagsum1!=sum){
			System.out.println("no");
			return;
		}
		System.out.println("yes");
	}
}
