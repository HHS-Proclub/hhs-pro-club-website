import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] answers = new int[n];
		for(int i = 0; i <n; i++) {
			answers[i] = s.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			int l = answers[i]+1;
			while(!isUnique(l)) {
				l++;
			}
			System.out.println(l);
		}

	}
	
	public static boolean isUnique(int num) {
		String s = num+"";
		int[] numUsed = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			numUsed[i] = s.charAt(i);
			
			for(int j = 0; j < i; j++) {
				if(numUsed[j] == numUsed[i]) {
					return false;
				}
			}
			
		}
		return true;
		
	}
	
	

}
