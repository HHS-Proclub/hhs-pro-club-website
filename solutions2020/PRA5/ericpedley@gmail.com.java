import java.util.ArrayList;
import java.util.Scanner;

public class PRA5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			int numStrings = Integer.parseInt(in.nextLine());
			ArrayList<String> strings = new ArrayList<String>();
			for(int i=0;i<numStrings;i++) {
				strings.add(in.nextLine());
			}
			int minMoves=-2;
			for(int i=0;i<numStrings;i++) {//for each string as the one that doesn't scroll
				int movesTotal=0;
				String curr=  strings.get(i);
				for(int j=0;j<numStrings;j++) {//for each other string
					if(j==i)
						continue;
					String contender = strings.get(j);
					int moves=0;
					while(!curr.equals(contender)) {
						contender = contender.substring(1,contender.length())+contender.charAt(0);
						moves++;
						if(moves>=curr.length()) {
							minMoves=-1;
							break;
						}
							
					}
					movesTotal+=moves;
				}
				if(minMoves==-2||movesTotal<minMoves)
					minMoves=movesTotal;
			}
			System.out.println(minMoves);
		}
	}
}
/*brute force
  
*/

//int minDiff = length;   attempt 2  - won't work because the largest difference between arms doesn't tell you what's in between them since the things aren't always in order or they won't be next to eachother
//int chosenOne = 0;
//for(int i=0;i<scrollMoves.length;i++) {//for each move count to determine minimum movecount
//	int diff = scrollMoves[i]-scrollMoves[(i==scrollMoves.length-1)?0:i+1];
//	if(Math.abs(length/2.0-diff)<minDiff) {
//		chosenOne=i;
//		minDiff=diff;
//	}
//}
//int totalMoves=0;
//String chosen = strings.get(chosenOne);
//for(int i=0;i<strings.size();i++) {
//	String s = strings.get(i);
//	int moves=0;
//	while(!s.equals(chosen)) {
//		s=s.substring(1,s.length())+s.charAt(0);
//		moves++;
//	}
//	totalMoves+=moves;
//}
//System.out.println(totalMoves);











//elegant solution(incorrect output but I don't know why)
//int numStrings = Integer.parseInt(in.nextLine());
//int[] scrollMoves = new int[numStrings];
//String first="";
//int length=0;
//boolean impossible=false;
//for(int i=0;i<numStrings;i++) {//for each string
//	if(i==0) {
//		first=in.nextLine();
//		length = first.length();
//	} else {
//		String s = in.nextLine();
//		int moves=0;
//		while(!s.equals(first)) {//for each character
//			s=s.substring(1,s.length())+s.charAt(0);
//			moves++;
//			if(moves==length) {
//				impossible=true;
//				break;
//			}
//		}
//		if(impossible) {
//			System.out.println("-1");
//			break;
//		}
//		scrollMoves[i]=moves;
//	}
//}
//if(impossible)
//	continue;
//int minMoves=-1;
//for(int i=0;i<length;i++) {//for each character
//	int moves=0;
//	for(int j=0;j<scrollMoves.length;j++) {//for every string
//		int curr = scrollMoves[j];
//		moves+=curr;
//		scrollMoves[j]=(curr==0)? length-1:curr-1;
//	}
//	if(minMoves==-1||moves<minMoves)
//		minMoves=moves;
//}
//System.out.println(minMoves);