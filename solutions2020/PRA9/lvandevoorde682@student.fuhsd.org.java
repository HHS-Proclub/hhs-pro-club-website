import java.util.Scanner;

public class PRA9 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = Integer.parseInt(k.nextLine());
		int[] answers = new int[n];

		// Number of trials
		for (int i = 0; i < n; i++) {
			String[] input = k.nextLine().split(" ");
			answers[i] = 0;
			
			for(int j = 0; j<7; j++){
				for(int a = 0; a < input.length; a++){
					if (Integer.parseInt(input[a]) % 7 == j){
						answers[i]++;
						break;
					}
				}
			}
			
		}

		for (int i = 0; i < n; i++) {
			System.out.println(answers[i]);
		}

		k.close();
	}
}
