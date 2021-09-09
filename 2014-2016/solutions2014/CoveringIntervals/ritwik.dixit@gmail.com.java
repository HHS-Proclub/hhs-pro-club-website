import java.io.*;
import java.util.*;

public class CoveringIntervals {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = Integer.parseInt(in.nextLine());
		int[][] intervals = new int[num][2];
		
		ArrayList<String>checks = new ArrayList<String>();
		
		for (int i = 0; i < num; i++) {
			
			StringTokenizer st = new StringTokenizer(in.nextLine());
			intervals[i][0] = Integer.parseInt(st.nextToken());
			intervals[i][1] = Integer.parseInt(st.nextToken());
		}

		int size = num;
			
		for (int a = 0; a < num - 1; a++) {
			for (int c = a + 1; c < num; c++) {
				
				if (intervals[c][0] < intervals[a][1] && intervals[c][1] > intervals[a][0]) {
					
					if (!checks.contains(a+"") && !checks.contains(c+"")) {
						size--;						
						checks.add(c + "");
					}

				}
				
				if (intervals[c][0] > intervals[a][1] && intervals[c][1] < intervals[a][0]) {
					
					if (!checks.contains(a+"") && !checks.contains(c+"")) {
						size--;						
						checks.add(c + "");	
					}


				}

			} 
		}
		System.out.println(size);
	}
	
	
	
	
}
