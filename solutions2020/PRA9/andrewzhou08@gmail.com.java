import java.util.Scanner;

public class PRA9 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = Integer.parseInt(kb.nextLine());
		String[] in = new String[n];
		for(int i = 0; i < n; i++) {
			in[i] = kb.nextLine();
		}
		
		for(int i = 0; i < n; i++) {
			String[] result = in[i].split("\\s+");
			int[] res = new int[result.length];
			for(int j = 0; j < result.length; j++) {
				res[j] = Integer.parseInt(result[j]);
			}
			
			boolean[] played = new boolean[7];
			for(int j = 0; j < res.length; j++) {
				played[res[j] % 7] = true;
			}
			
			
			
			int numPlayed = 0;
			for(int j = 0; j < 7; j++) {
				if(played[j]) {
					numPlayed++;
				}
			}
			System.out.println(numPlayed);
		}
	}
}
