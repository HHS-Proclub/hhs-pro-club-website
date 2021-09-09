import java.util.HashMap;
import java.util.Scanner;

public class PRB5 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, Integer> data = new HashMap<Character, Integer>();
		String input = scanner.next();
		char[] inArray = input.toCharArray();
		for(char x: inArray){
			if(data.containsKey(x))
				data.put(x, data.get(x) + 1);
			else
				data.put(x, 1);
			
		}
		for(int i = 0; i < 128; i++){
			if(data.containsKey((char) i ))
			System.out.println(((char) i) + " " + data.get((char)i));
		}
		scanner.close();	
	}
}
