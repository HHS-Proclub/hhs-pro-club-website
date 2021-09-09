import java.util.Scanner;

public class PRA12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		boolean[] answers = new boolean[cases];
		//do operations on each string
		for(int i = 0; i < cases; i++){
			String word = sc.next();
			boolean possible = getPossibility(0, word, false);
			answers[i] = possible;
		}
		
		//print the boolean answers
		for(int i = 0; i < cases; i ++){
			if(answers[i]){
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}
	}
	
	public static boolean getPossibility(int postion, String word, boolean result){
		int usablePostion = postion;
		boolean uresult = result;
		String usableWord = word;
		if(usablePostion < word.length()-1){
			if(word.charAt(usablePostion) == word.charAt(usablePostion + 1)){
				String cutWord = usableWord.substring(0, usablePostion);
				cutWord += usableWord.substring(usablePostion+2, usableWord.length());
				usableWord = cutWord;
				if(cutWord.length() == 0){
					return true;
				} else if(cutWord.length() != 0){
					return getPossibility(0, usableWord, uresult);
				}
			} else {
				return getPossibility(usablePostion+1, usableWord, uresult);
			}
		}
		return false;
		
	}
}
