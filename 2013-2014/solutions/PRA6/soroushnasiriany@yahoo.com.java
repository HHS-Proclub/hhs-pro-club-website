import java.util.*;

public class PRA6 {
	static char array[][];
	static int iSize;
	static int jSize;
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		jSize = scan.nextInt();
		iSize = scan.nextInt();
		
		array = new char[iSize][jSize];
		
		scan.nextLine();
		int rooms = -1;
		for(int i = 0; i < iSize; i++) {
			String line = scan.nextLine();
			for(int j = 0; j < jSize; j++) {
				array[i][j] = line.charAt(j);
			}
		}
		for(int i = 0; i < iSize; i++) {
			for(int j = 0; j < jSize; j++) {
				if(array[i][j] == '.') {
					check(i, j);
					rooms++;
				}
			}
		}
		System.out.println(rooms);
		
	}
	
	public static void check(int x, int y) {
		if(x  < 0 || x >= iSize || y < 0 || y >= jSize) return;
		if(array[x][y] == '#') return;
		array[x][y] = '#';
		check(x + 1, y);
		check(x - 1, y);
		check(x, y + 1);
		check(x, y - 1);	
	}
}
