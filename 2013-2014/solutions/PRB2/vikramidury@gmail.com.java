import java.util.Scanner;


public class PRB2 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		kboard.nextLine();
		String text = kboard.nextLine();
		int sum = 0;
		
		for(int i = 0; i < n; i++){
			sum += Integer.parseInt(text.charAt(i) + "");
		}
		System.out.print(sum);
	}
}
