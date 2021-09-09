import java.util.Scanner;

public class PRB2 {
	
	static int[][] array;
	static int[] answers;
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int testcases = kboard.nextInt();
		answers = new int[testcases];
		for(int i = 0; i < testcases; i++) {
			int r = kboard.nextInt();
			int c = kboard.nextInt();
			int n = kboard.nextInt();
			int k = kboard.nextInt();
			array = new int[r][c];
			for(int j = 0; j < n; j++) {
				int x = kboard.nextInt();
				int y = kboard.nextInt();
				array[x-1][y-1] = 1;
			}
			int totalCount = 0;
			for(int rwidth = 1; rwidth <= r; rwidth++) {
				for(int cwidth = 1; cwidth <= c; cwidth++) {
					for(int x = 0; x < r-rwidth+1; x++) {
						for(int y = 0; y < c-cwidth+1; y++) {
							int counter = 0;
							for(int l = 0; l < rwidth; l++) {
								for(int we = 0; we < cwidth; we++) {
									if(array[x+l][y+we] == 1) {
										counter++;
									}
								}
							}
							if(counter >= k) {
								//System.out.println(x+" "+y+" "+rwidth+" "+cwidth);
								totalCount++;
							}
						}
					}
				}
			}
			answers[i] = totalCount;
		}
		for(int i = 0; i < testcases; i++) {
			System.out.println(answers[i]);
		}
	}
}
