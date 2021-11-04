import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int numPoems = kboard.nextInt(); 
		String[] results = new String[numPoems];
		
		String line0 = kboard.nextLine();
		for(int i=0; i < numPoems; i++) {
			String line1 = kboard.nextLine();
			String line2 = kboard.nextLine();
			String line3 = kboard.nextLine();
			
			// 1st line of poem
			int numVowels1 = 0;
			for(int k=0; k < line1.length(); k++) {
				if(line1.charAt(k) == 'a' || line1.charAt(k) == 'e' || line1.charAt(k) == 'i' || line1.charAt(k) == 'o' || line1.charAt(k) == 'u')
					numVowels1++;
			}
			
			// 2nd line of poem		
			int numVowels2 = 0;
			for(int k=0; k < line2.length(); k++) {
				if(line2.charAt(k) == 'a' || line2.charAt(k) == 'e' || line2.charAt(k) == 'i' || line2.charAt(k) == 'o' || line2.charAt(k) == 'u')
					numVowels2++;
			}
			
			// 3rd line of poem		
			int numVowels3 = 0;
			for(int k=0; k < line3.length(); k++) {
				if(line3.charAt(k) == 'a' || line3.charAt(k) == 'e' || line3.charAt(k) == 'i' || line3.charAt(k) == 'o' || line3.charAt(k) == 'u')
					numVowels3++;
			}
			
			if(numVowels1 == 5 && numVowels2 == 7 && numVowels3 == 5) 
				results[i] = "YES";
			else 
				results[i] = "NO";
		}
		
			for (String s : results) {
				System.out.println(s);
			}
	}
}