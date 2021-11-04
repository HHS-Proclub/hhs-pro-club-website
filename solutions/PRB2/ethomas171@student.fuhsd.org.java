package PRB2;
import java.util.Scanner;
public class PRB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_poems = sc.nextInt();
		String clear_ln = sc.nextLine();
		int syllableCountln1,syllableCountln2, syllableCountln3; 
		
		for(int i = 0; i<num_poems;i++) {
			String ln1 = sc.nextLine();
			
			int ln1Length = ln1.length();
			
			char[] chars_ln1 = new char[ln1Length];
			
			syllableCountln1 = 0;
			
			for(int repeat = 0; repeat<ln1Length-1; repeat++) {
				//adds all the characters of the line to a array
				
				chars_ln1[repeat] = ln1.charAt(repeat);
				if(chars_ln1[repeat] == 'a' || chars_ln1[repeat] == 'e'
				|| chars_ln1[repeat] == 'i' || chars_ln1[repeat] == 'o' 				|| chars_ln1[repeat] == 'u') {
					
					// if one of the characters is a vowel the syllables count increases
					syllableCountln1++;
				} 
			}
			
			
			
			
			
			//following is for line 2
			String ln2 = sc.nextLine();
			
			int ln2Length = ln2.length();
			
			char[] chars_ln2 = new char[ln2Length];
			
			syllableCountln2 = 0;
			
			for(int repeat = 0; repeat<ln2Length-1; repeat++) {
				//adds all the characters of the line to a array
				
				chars_ln2[repeat] = ln2.charAt(repeat);
				if(chars_ln2[repeat] == 'a' || chars_ln2[repeat] == 'e'
				|| chars_ln2[repeat] == 'i' || chars_ln2[repeat] == 'o' 
				|| chars_ln2[repeat] == 'u') {
					
					// if one of the characters is a vowel the syllables count increases
					syllableCountln2++;
				}
			}
			
			
			
			
			//following is for line 3
			String ln3 = sc.nextLine();
			
			int ln3Length = ln3.length();
			
			char[] chars_ln3 = new char[ln3Length];
			
			syllableCountln3 = 0;
			
			for(int repeat = 0; repeat<ln3Length-1; repeat++) {
				//adds all the characters of the line to a array
				
				chars_ln3[repeat] = ln3.charAt(repeat);
				if(chars_ln3[repeat] == 'a' || chars_ln3[repeat] == 'e'
				|| chars_ln3[repeat] == 'i' || chars_ln3[repeat] == 'o' 
				|| chars_ln3[repeat] == 'u') {
					
					// if one of the characters is a vowel the syllables count increases
					syllableCountln3++;
				}
			}
			
			if(syllableCountln1 == 5 && syllableCountln2 == 7 && syllableCountln3 == 5) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		//end of for loop for one poem, repeats specified times
			
		}
		
	}

}
