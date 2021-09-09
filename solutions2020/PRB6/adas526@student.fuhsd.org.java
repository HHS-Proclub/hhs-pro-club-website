import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		List<Integer> output = new ArrayList<>();
		
		for (int i = 0; i < x; i++) {
			int numR = in.nextInt();
			int numC = in.nextInt();
			int[][] matrix = new int[numR][numC];
			
			for (int j = 0; j < numR; j++) {
				for (int k = 0; k < numC; k++) {
					matrix[j][k] = in.nextInt();
				}
			}
			output.add(spotlight(matrix));
		}
		for (int i : output) {
			System.out.println(i);
		}
		in.close();
	}
	public static int spotlight(int[][] matrix) {
		Map<Integer, List<Integer>> positionsR = new HashMap<>();
		Map<Integer, List<Integer>> positionsC = new HashMap<>();
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					if (!positionsR.containsKey(i)) {
						List<Integer> cols = new ArrayList<>();
						cols.add(j);
						positionsR.put(i, cols);
					} else {
						List<Integer> cols = positionsR.get(i);
						cols.add(j);
						positionsR.put(i, cols);
					}
					if (!positionsC.containsKey(j)) {
						List<Integer> rows = new ArrayList<>();
						rows.add(i);
						positionsC.put(j, rows);
					} else {
						List<Integer> rows = positionsC.get(j);
						rows.add(i);
						positionsC.put(j, rows);
					}
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					if (positionsR.containsKey(i)) {
						int index = Math.abs(Collections.binarySearch(positionsR.get(i), j) + 1);
						if (index > 0 && index < positionsR.get(i).size()) {
							count += 2;
						} else {
							count += 1;
						}
					}
					if (positionsC.containsKey(j)) {
						int index = Math.abs(Collections.binarySearch(positionsC.get(j), i) + 1);
						if (index > 0 && index < positionsC.get(j).size()) {
							count += 2;
						} else {
							count += 1;
						}					
					}
				}
			}
		}
		return count;
	}
}

