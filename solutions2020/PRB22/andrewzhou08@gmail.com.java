import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB22 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Character> diet = new ArrayList<Character>();
		char[] dietTemp = kb.nextLine().toCharArray();
		for(char c : dietTemp) {
			diet.add(c);
		}
		char[] breakfast = kb.nextLine().toCharArray();
		char[] lunch = kb.nextLine().toCharArray();
		
		for(int i = 0; i < breakfast.length; i++) {
			for(int j = diet.size()-1; j >= 0; j--) {
				if(breakfast[i] == diet.get(j)) {
					diet.remove(j);
					break;
				}
			}
		}
		
		for(int i = 0; i < lunch.length; i++) {
			for(int j = diet.size()-1; j >= 0; j--) {
				if(lunch[i] == diet.get(j)) {
					diet.remove(j);
					break;
				}
			}
		}
		
		char[] temp = new char[diet.size()];
		int i = 0;
		for(char c : diet) {
			temp[i] = c;
			i++;
		}
		
		Arrays.sort(temp);
		
		for(char c : temp) {
			System.out.print(c);
		}
	}
}
