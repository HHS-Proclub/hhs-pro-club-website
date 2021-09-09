import java.util.ArrayList;
import java.util.Scanner;
//import java.util.ArrayList;



public class PRA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		int numHangDays = 0;
		//int totalA = 0;
		//int totalI = 0;
		for(int y = 0; y < numTestCases; y++) { 
			int x = sc.nextInt();
			int n = sc.nextInt();
			int d = sc.nextInt();
			int[] importances = new int[n];
			int[] durations = new int[n];
			for(int z = 0; z < n; z++) {
				int i = sc.nextInt();
				int a = sc.nextInt();
				importances[z] = i;
				durations[z] = a;
			}
				//while (totalI == 0) {
			//ArrayList<Integer> difficulties = new ArrayList<Integer>();
			ArrayList<Integer> times = new ArrayList<Integer>();
			int difficultySum = 0;
			int durationSum = 0;
				for(int index = 0; index < importances.length; index++) {
					difficultySum += importances[index];
					durationSum += durations[index];
					for(int a = 0; a < importances.length; a++) {
						if(index != a) {
							difficultySum += importances[a];
							durationSum += durations[a];
							if(difficultySum >= d) {
								//difficulties.add(difficultySum);
								times.add(durationSum);
							}
						}
					}
					difficultySum = 0;
					durationSum = 0;
				}
			if(times.size() == 0)
				System.out.println(-1);
			else {
				int max = 0;
				int end = times.size() - 1;
				for(int start = 0; start < end; start++) {
					if(times.get(start) < max) {
						times.remove(start);
						//difficulties.remove(start);
						start--;
						end--;
					} else {
						max = times.get(start);
					}
					
				}
				numHangDays = x - times.get(0);
				System.out.println(numHangDays);
			}
			

				//}
			// INSERT MAXIMIZATION HERE
			
			
		}
		
		

	}

}

