import java.util.ArrayList;
import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		ArrayList<Integer> people = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			int n = sc.nextInt();

			int num_people = 1;
			while(true) {
				n /= num_people;
				if(n / (num_people+1) >= 1)
					num_people++;
				else 
					break;
			}
			
			people.add(num_people);
		}

		for(int person : people) {
			System.out.println(person);
		}
	}

}
