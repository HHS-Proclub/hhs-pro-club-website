import java.util.*;

public class PRB4 {
	public static void main(String args[] ){
		@SuppressWarnings("resource")
		Scanner palin = new Scanner(System.in);
		String testable = palin.nextLine();
		int wordlength = testable.length();
		boolean isPalin = false;
		for(int i = 0; i < wordlength; i++){
			if(String.valueOf(testable.charAt(i)).equals(String.valueOf(testable.charAt(wordlength - (i+1))))){
				isPalin = true;
			}
			else
			{
				isPalin = false;
				i = wordlength + 1;
			}
		}
		if(isPalin){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

}
