import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		//Input
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] candy = new int[num];
		for(int a = 0; a < num; a++) {
			candy[a] = input.nextInt();
		}
		
		int given = 0;
		int people = 0;
		for(int i = 0; i < num; i++) {
			boolean done = false;
			int counter = 1;
			given = 0;
			people = 0;
			while(!done) {		
				if(given+counter > candy[i]) {
					candy[i] = people;
					done = true;
				}else {
					given += counter;
					people++;
					counter++;
				}
			}		
		}
		for(int b = 0; b < num; b++) {
			System.out.println(candy[b]);
		}
	}
}
