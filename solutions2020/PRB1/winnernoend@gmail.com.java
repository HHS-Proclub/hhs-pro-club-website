import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int reps = Integer.parseInt(in.nextLine());

		for(int k = 0; k < reps; k++){
			int candy = Integer.parseInt(in.nextLine());

			int people = 0;
			int increment = 1;
			while(candy > 0){
				if(candy - increment >= 0) {
					candy = candy - increment;
					people++;
					increment++;
				}
				else{
					break;
				}
			}
			System.out.println(people);
		}
	}
}
