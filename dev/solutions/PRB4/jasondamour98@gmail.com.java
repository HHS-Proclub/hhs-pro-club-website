import java.util.Scanner;


public class PRB4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numWords = Integer.parseInt(input.nextLine());
		String word[] = new String[numWords];

		for(int a=0; a<numWords; a++){
			word[a] = input.nextLine();
		}for(int j=0; j<numWords; j++){
			String vowel[] = {"a","e","i","o","u"};
			String firstLetter = word[j].substring(0,1);
			String restOfWord = word[j].substring(1);
			boolean x = false;
			
			for(int i=0; i<word[j].length(); i++){
				x=firstLetter.contains(vowel[i]);
				if(x==true){
					break;
				}
			}
			if(x==true){
				System.out.println(word[j] + "way");
			}else{
				System.out.println(restOfWord + firstLetter + "ay");	
			}
		}
	}
}
