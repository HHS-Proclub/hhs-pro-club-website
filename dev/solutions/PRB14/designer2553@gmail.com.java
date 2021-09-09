import java.util.*;

public class PRB14 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arrays = new int[n][n];
		
		for (int r = 0; r < arrays.length; r++) {
			
			for (int c = 0; c < arrays.length; c++) {
				arrays[r][c] = s.nextInt();
			}
		}
		
//		Comparator<Integer> comparator = new Comparator<Integer> () {
//			public int compare (Integer x, Integer y) {
//				return x > y ? 1 : (x < y ? -1 : 0);
//			}
//		};
		
		for (int i = 0; i < arrays.length; i++) {
			Arrays.sort(arrays[i]);
		}
		
		int center = (int)(n / 2.0);
		
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i][center]);
		}
	}
	
}
