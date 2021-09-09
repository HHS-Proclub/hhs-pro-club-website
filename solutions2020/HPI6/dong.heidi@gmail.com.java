import java.util.Arrays;
import java.util.Scanner;

public class HPI6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int r, c;
		int size = 0;
		String[] input = new String[n]; 
		for (int i = 0; i < n; i++) {
			input[i] = in.nextLine();
			r = (int) input[i].charAt(0) - 'A';
			c = (int) input[i].charAt(2) - 'A';
			if (r > size) size = r;
			if (c > size) size = c;
		}
		int[][] adj = new int[size + 1][size + 1];
		for (int i = 0; i < n; i++) {
			r = (int) input[i].charAt(0) - 'A';
			c = (int) input[i].charAt(2) - 'A';
			adj[r][c] = Integer.parseInt(input[i].split(" ")[2]);
		}
		
		String line = in.nextLine();
		int START, END;
		START = (int) line.charAt(0) - 'A';
		END = (int) line.charAt(2) - 'A';
		
		for (int k = 0; k < adj.length; k++) {
			for (int i = 0; i < adj.length; i++) {
				for (int j = 0; j < adj.length; j++) {
					if (adj[i][j] == 0 && i != j && adj[i][k] > 0 && adj[k][j] > 0)
						adj[i][j] = adj[i][k] + adj[k][j];
					else if (adj[i][j] > 0 && adj[i][k] > 0 && adj[k][j] > 0)
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}
		System.out.println(adj[START][END]);
	}

}
