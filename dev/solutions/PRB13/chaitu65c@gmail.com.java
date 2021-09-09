import java.util.Scanner;
public class PRB13 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		System.out.println("");
		String word = kboard.next();
		int x = word.length();
		word = word.toLowerCase();
		for(int i = 0; i < x; i++){
			if(Character.isLetter(word.charAt(i)) == true){
			}
			else{
			   word = word.replace(word.substring(i, i+1), " ");
			}
			
		}
		word = word.replaceAll(" ", "");
		x = word.length(); 
		String s2 = word;
		String result = "";
		for (int i = 1; i <= x; i++) {
			int n = word.length();
			String s1 = word.substring(n - 1, n);
			word = word.substring(0, n - 1);
			result = result + s1;
		}
		boolean result1;
		if(s2.compareTo(result) == 0){
			result1 = true;
		}
		else{
			result1 =  false;
		}
			System.out.println(result1);
	}
}
