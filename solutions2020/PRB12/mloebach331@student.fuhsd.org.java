import java.util.Scanner;
public class PRB12 {

	public static void main(String[] args) {
		Scanner Bscan = new Scanner(System.in);
		
		int cases = Integer.parseInt(Bscan.nextLine());
		String[] wordBank = new String[cases];
		String[] halfBank = new String[cases];
		for(int inputter = 0; inputter < cases; inputter++){
			wordBank[inputter] = Bscan.nextLine();
		}
		
		for(int cycle = 0; cycle < cases; cycle++){
			int half = (wordBank[cycle].length())/2;
			halfBank[cycle] = wordBank[cycle].substring(0, half);
		}
		
		for(int print = 0; print < cases; print++){
			System.out.println(halfBank[print]);
		}
		
		// TODO Auto-generated method stub

	}

}
