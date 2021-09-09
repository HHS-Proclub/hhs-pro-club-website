import java.util.*;
public class Spiral {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int SIZE = in.nextInt();
		int[] di = {0, 1, 0, -1};
		int[] dj = {1, 0, -1, 0};
		int dir = 0;
		int i = 0, j = 0;
		int[][] array = new int[SIZE][SIZE];
		int number = 1;
	
		while(number<=SIZE*SIZE){
			array[i][j] = number;
			number++;
			int newi = i + di[dir];
			int newj = j + dj[dir];
			if(newi>=0&&newj>=0&&newi<SIZE&&newj<SIZE&&array[newi][newj]==0){
			}
			else{
				dir = (dir+1)%4;
			}
			i += di[dir];
			j += dj[dir];
		}
		for(i = 0; i < SIZE; i++){
			for(j = 0; j < SIZE; j++){
				System.out.printf("%-4s", array[i][j]);
			}
				
			System.out.println();
		}
	}
	
		
}
