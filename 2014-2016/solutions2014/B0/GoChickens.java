import java.util.Scanner;


public class B0 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		String nN = kboard.nextLine();
		int n = Integer.parseInt(nN);
		String print = "";
		for(int i=0; i<n; i++){
			print += kboard.nextLine()+'\n';
		}
		System.out.print(print);
	}
}
