import java.util.Scanner;
public class PRB10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fraction = scan.nextLine();
		String[] parts = fraction.split("/");
		int a = Integer.parseInt(parts[0]);
		int b = Integer.parseInt(parts[1]);
		int AnswerA = a;
		int AnswerB = b;
		
		for(int cycle = b; cycle > 1; cycle--){
			if(a % cycle == b % cycle && a % cycle == 0){
				a = a/cycle;
				b = b/cycle;
				System.out.println(cycle);
				System.out.println(a+"/"+b);
			}
		}
		System.out.println(a+"/"+b);

	}

}
