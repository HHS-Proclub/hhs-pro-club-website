import java.util.*;
public class PRB3_1 {
		
	
	static int nInt(Scanner s) {
		return Integer.parseInt(s.next().trim());
	}
	
	static int[] castInt(String[] s) {
		int[] result = new int[s.length];
		for(int c=0;c<s.length;c++) {
			result[c]=Integer.parseInt(s[c]);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");
		int[][] input = new int[nInt(in)][];
//		for(int[] c: input) {
//			c=new int[in.nextInt()];
//		}
//		

		
		int[] numR = new int[input.length];
		for(int x=0;x<input.length;x++) {
			input[x]=new int[nInt(in)];
			int numRemovals=0;
			input[x] = castInt(in.next().trim().split(" ",input[x].length));
			for(int y=0;y<input[x].length;y++) {
				boolean remove=true;
				for(int c=0; c<input[x].length;c++) {
					int z=input[x][c];
					if(c!=y) {
						double log = Math.log(input[x][y]+z)/Math.log(2);
						
						if((int)log==log) {
							
							remove=false;
						}
					}
				}
				if(remove) {
					numRemovals++;
				}

			}

			numR[x]=numRemovals;
		}
		for(int x: numR) {
			System.out.println(x);
		}
	}
	
}
