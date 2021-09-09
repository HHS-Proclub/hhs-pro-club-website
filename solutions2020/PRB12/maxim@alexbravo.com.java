import java.util.Scanner;

public class PRB12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String[] result = new String[cases];
		for(int i = 0; i < cases; i++){
			String word = sc.next();
			if(word.length()%2 == 0){
				result[i] = word.substring(0, word.length()/2);
			}
		}
		for(int i = 0; i < cases; i++){
			if(result[i] != null){
				System.out.println(result[i]);
			}	
		}
		sc.close();
	}
}
