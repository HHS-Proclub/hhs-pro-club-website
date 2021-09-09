import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int j = 0; j < cases; j++) {
			int input = sc.nextInt();
			int[] islands = new int[input];
			int[] result = new int[input];
			for(int x = 0; x < input; x++) {
				islands[x] = sc.nextInt();
			}
			for(int y = 0; y < input; y++) {
				result[y] = sc.nextInt();
			}
			
			//Finds index of 0
			int index = 0;
			for(int i = 0; i < islands.length; i++) {
				if(islands[i] == 0) {
					index = i;
				}
			}
			//Rotates array (0 is in front)
			int[] temp = new int[index];
			for(int a = 0; a < temp.length; a++) {
				temp[a] = islands[a];
			}
			for(int b = 0; b < islands.length-index; b++) {
				islands[b] = islands[index+b];
			}
			for(int c = 0; c < temp.length; c++) {
				islands[islands.length-index+c] = temp[c];
			}
			/*for(int a = 0; a < input; a++) {
				System.out.print(islands[a]+" ");
			}*/
			
			int temp2 = 0;
			int counter = 0;
			for(int i = 0; i < (input-1)*input; i++){
				if(i%input+1 == islands.length) {
					temp2 = islands[0];
					islands[0] = 0;
					islands[i%input] = temp2;
				}else {
					temp2 = islands[i%input+1];
					islands[i%input+1] = 0;
					islands[i%input] = temp2;
				}	
				/*for(int a = 0; a < input; a++) {
					System.out.print(islands[a]+" ");
				}
				System.out.println();
				*/
				
				//Checks the two arrays
				counter = 0;
				for(int z = 0; z < islands.length; z++) {
					if(islands[z] != result[z]) {
						break;
					}
					counter++;	
				}
				if(counter == islands.length) {
					System.out.println("YES");
					break;
				}
			}
			if(counter != islands.length) {
				System.out.println("NO");
			}
		}
	}
}
