//package PR_3;

import java.util.Scanner;

public class PRA3 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int tests = 0; tests < cases; tests++){
			String[] argStrArr = new String[3];
			argStrArr = (in.nextLine()).split(" ");
    		int time = Integer.valueOf((argStrArr[0]));
    		int assignments = Integer.valueOf(argStrArr[1]);
    		int difficulty = Integer.valueOf(argStrArr[2]);
    		int[][] options = new int[assignments][2];
    		for (int j = 0; j<assignments;j++){
    			String[] argArr = new String[3];
        		argArr = (in.nextLine()).split(" ");
        		options [j][1] = Integer.parseInt(argArr[0]); //importance
        		options [j][0] = Integer.parseInt(argArr[1]); //time
    		}
    		int duration = timeUsed(0,0,difficulty,0,assignments,options);
    		int out = (duration < 0) ? -1 : (time-duration);
    		System.out.println(out);
    	}
		
		in.close();
	}
	
	private static int timeUsed(int currentDuration, int currentImportance, int targetImportance, int myIndex, int maxIndex, int[][] set ){
		if (currentImportance >= targetImportance) {
			return currentDuration;
		} else if (myIndex >= maxIndex) {
			return -1;
		} else {
			int durationIfNotPicked = timeUsed(currentDuration, currentImportance, targetImportance, myIndex+1, maxIndex, set);
			int durationIfPicked 	= timeUsed(currentDuration + set[myIndex][0], currentImportance + set[myIndex][1],
											targetImportance, myIndex+1, maxIndex, set);
			int returnval =		((durationIfPicked < 0) ? durationIfNotPicked : 
								(durationIfNotPicked < 0) ? durationIfPicked : 
								 Math.min(durationIfPicked, durationIfNotPicked));
			return returnval;
			
		}
	}
}
