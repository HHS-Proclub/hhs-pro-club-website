import java.util.Scanner;
import java.util.Arrays;
public class PRB12 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int reps = Integer.parseInt(in.nextLine());
		for(int i = 0; i < reps; i++){
			String[] arrayed = (in.nextLine()).split("(?!^)");
			String[] finale = new String[arrayed.length/2];
			for(int k = 0; k < finale.length; k++){
				finale[k] = arrayed[k];
			}
			StringBuffer result = new StringBuffer();
			for (int d = 0; d < finale.length; d++) {
			   result.append( finale[d] );
			   //result.append( optional separator );
			}
			String mynewstring = result.toString();
			System.out.println(mynewstring);
		}
		
	}
}
