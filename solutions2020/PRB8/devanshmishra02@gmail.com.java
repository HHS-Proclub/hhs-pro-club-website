import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        for(int i = 0; i < x; i++) {
        	int num = input.nextInt();
        	int[][] cubes = new int[num][6];
        	for(int j = 0; j < num; j++) {
            	for(int n = 0; n < 6; n++) {
            		cubes[j][n] = input.nextInt();
            	}
            }
        	if(num == 1) {
        		int index = 1;
            	while(bruteForceFind1(index + "", cubes, num)) {
            		index++;
            	}
            	System.out.println(index - 1);
        	} else {
        		int index = 1;
            	while(bruteForceFind(index + "", cubes, num)) {
            		index++;
            	}
            	System.out.println(index - 1);
        	}
        	
        	
        }
	}

	private static boolean bruteForceFind(String index, int[][] cubes, int num) {
		if(index.length() == 1) {
			for(int i = 0; i < num; i++) {
				for(int j = 0 ; j < 6; j++) {
					if(index.equals(cubes[i][j]+"")) {
						return true;
					}
				}
			}
			return false;
		} else if(index.length() == 2) {
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < 6; j++) {
					for(int t = 0; t < 6; t++) {
						
						if(i-1 == -1) {
							if((cubes[i][j]+""+cubes[num-1][t]).equals(index)) {
								return true;
							}
						} else {
							if((cubes[i][j]+""+cubes[i-1][t]).equals(index)) {
								return true;
							}
						}
						if(i+1 == num) {
							if((cubes[i][j]+""+cubes[0][t]).equals(index)) {
								return true;
							}
						} else {
							if((cubes[i][j]+""+cubes[i+1][t]).equals(index)) {
								return true;
							}
						}
					}
				}
			}
			return false;
		} 
		return false;
	}
	private static boolean bruteForceFind1(String index, int[][] cubes, int num) {
		if(index.length() == 1) {
			for(int i = 0; i < num; i++) {
				for(int j = 0 ; j < 6; j++) {
					if(index.equals(cubes[i][j]+"")) {
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}
}
