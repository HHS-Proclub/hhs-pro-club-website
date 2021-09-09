import java.io.*;
import java.util.*;

public class HPI2 {
	static char[][] arr;
	static int R, C;
	
	public static void floodfill(int r, int c) {
		if (r < 0 || r >= R || c < 0 || c >= C) {
			return;
		}
		if (arr[r][c] == 'X')
			return;
		arr[r][c] = 'X';
		floodfill(r-1, c);
		floodfill(r+1, c);
		floodfill(r, c-1);
		floodfill(r, c+1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		R = x;
		C = y;
		arr = new char[x][y];
		for(int i = 0; i < x; i++){	
				arr[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < C; i++) {
			if (arr[0][i] == '.')
				floodfill(0, i);
			if (arr[R-1][i] == '.')
				floodfill(R-1, i);
		}
		for (int i = 0; i < R; i++) {
			if (arr[i][0] == '.')
				floodfill(i, 0);
			if (arr[i][C-1] == '.')
				floodfill(i, C-1);
		}
		int count = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (arr[i][j] == '.')
					count++;
			}
		}
		System.out.print(count);
		
	}

}