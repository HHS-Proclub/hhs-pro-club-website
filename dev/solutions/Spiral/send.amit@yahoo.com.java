import java.util.*;
public class Spiral {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int SIZE = in.nextInt();
		int[] di = {0, 1, 0, -1};
		int[] dj = {1, 0, -1, 0};
		int dir = 3;
		int i = 0, j = -1;
		int[][] array = new int[SIZE][SIZE];
		int number = 1;
	
		for(int x = SIZE ; x > 0; x--){
			for(int count = 0; count < 2; count++) {
				dir = (dir + 1) % 4;
				for(int steps = 1; steps <= x; steps++){
					i += di[dir];
					j += dj[dir]; 
					array[i][j] = number;
					number++;
				
				}
				if(x == SIZE)
					break;
			}
		}
		
		for(i = 0; i < SIZE; i++){
			for(j = 0; j < SIZE; j++){
				System.out.printf("%-4s", array[i][j]);
			}
				
			System.out.println();
		}
	}
	
		
}
