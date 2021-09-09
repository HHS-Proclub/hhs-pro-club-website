import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		//long startTime = System.nanoTime();
		
		
		for(int z = 0; z < cases; z++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			boolean[][] rect = new boolean[r][c];
			int n = sc.nextInt();
			int k = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				rect[x-1][y-1] = true;
			}
			int result = 0;
			for(int a = 0; a < r; a++) {
				//System.out.println(a);
				for(int b = 0; b < c; b++) {
					//System.out.println(b);	
					for(int d = 0; d < r; d++) {
						//System.out.println(d);
						for(int e = 0; e < c; e++) {
							//System.out.println(e);
							int students = 0;
							boolean done = false;
							for(int f = a; f <= d; f++) {
								//System.out.println(f);
								for(int g = b; g <= e; g++) {
									//System.out.println(g);
									if(rect[f][g]) {
										students += 1;
									}		
								}	
							}
							if(students >= k) {
								result += 1;
							}
							//System.out.println(students);
						}
					}	
				}
			}
			System.out.println(result);
		}
		//long endTime = System.nanoTime();
		//System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
}
