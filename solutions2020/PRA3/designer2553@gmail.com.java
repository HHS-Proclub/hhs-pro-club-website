import java.util.Arrays;
import java.util.Scanner;

public class PRA3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int[] results = new int[cases];
		
		for (int i = 0; i < cases; i++) {
			int holidays = in.nextInt();
			int tasks = in.nextInt();
			int minDiff = in.nextInt();
			Assignment[] assignments = new Assignment[tasks];
			
			for (int j = 0; j < assignments.length; j++)
				assignments[j] = new Assignment(in.nextInt(), in.nextInt());
			Arrays.sort(assignments);
			
//			for (Assignment assignment : assignments) {
//				System.out.println(assignment);
//			}
			
			int totalImportance = 0;
			for (Assignment assignment : assignments) {
				totalImportance += assignment.getImportance();
			}
			
			if (totalImportance < minDiff) {
				results[i] = -1;
				continue;
			}
			
			int totalLength = 0;
			int totalDiff = 0;
			
			for (Assignment assignment : assignments) {
				totalLength += assignment.getLength();
				totalDiff += assignment.getImportance();
				
				if (totalLength > holidays) {
					totalLength -= assignment.getLength();
					totalDiff -= assignment.getImportance();
				}
				if (totalDiff >= minDiff) {
					break;
				}
			}
			
//			if (totalDiff < minDiff) {
//				results[i] = -1;
//			} else {
//				results[i] = holidays - totalLength;
//			}
			results[i] = holidays - totalLength;
		}
		
		for (int result : results) {
			System.out.println(result);
		}
		
		in.close();
	}

}

class Assignment implements Comparable<Assignment> {
	private int importance;
	private int length;
	
	public Assignment (int importance, int len) {
		this.importance = importance;
		length = len;
	}
	
	@Override
	public int compareTo (Assignment other) {
		
		if (importance > other.importance) return 1;
		else if (importance < other.importance) return -1;
		else {
			if (length > other.length) return -1;
			else if (length < other.length) return 1;
			else return 0;
		}
	}
	
	public int getImportance () {
		return importance;
	}
	
	public int getLength () {
		return length;
	}
	
	public String toString () {
		return importance + " " + length;
	}
}