import java.util.Scanner;

public class PRA12 {

	public static void main(String[] args) {
//		final int[] ORIGIN = {0, 0};
		Scanner s = new Scanner(System.in);
		int pairs = s.nextInt();
		int[][] points = new int[pairs][2];
		
		for (int r = 0; r < points.length; r++) {
			
			for (int c = 0; c < points[r].length; c++) {
				points[r][c] = s.nextInt();
			}
		}
		
		int[][] distances = new int[pairs][pairs-1];
		int index = 0;
		
		for (int r1 = 0; r1 < points.length; r1++) {
			
			for (int r2 = 0; r2 < points.length; r2++) {
				if (r1 == r2) {
					continue;
				}
				
				int deltaX = points[r1][0] - points[r2][0];
				int deltaY = points[r1][1] - points[r2][1];
				distances[r1][index] = deltaX >= deltaY ? deltaX : deltaY;
				index++;
			}
			
			index = 0; // Always reset to 0 to prevent IndexOutOfBoundsException
		}
		
		int[] kingsDistances = new int[pairs];
		
		for (int r = 0; r < distances.length; r++) {
			
			for (int c = 0; c < distances[r].length; c++) {
				kingsDistances[r] += distances[r][c];
			}
		}
		
		int shortestKingsDistance = 0;
		
		for (int i = 0; i < kingsDistances.length; i++) {
			if (shortestKingsDistance == 0) {
				shortestKingsDistance = kingsDistances[i];
			}
			
			shortestKingsDistance = shortestKingsDistance >= kingsDistances[i] ? kingsDistances[i] : shortestKingsDistance;
		}
		
		System.out.println(shortestKingsDistance);
	}

}
