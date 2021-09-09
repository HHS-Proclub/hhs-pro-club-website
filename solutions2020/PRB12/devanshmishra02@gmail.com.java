import java.util.Scanner;
public class PRB12 {
	public static void main(String[] args){
		Scanner s  = new Scanner(System.in);
		int a = s.nextInt();
		for(int i = 0; i<a; i++){
			String word = s.next();
			final int length = word.length()/2;
			
			String[] parts = {word.substring(0, length),word.substring(length)};
			System.out.println(parts[0]);
		}
	}

}
