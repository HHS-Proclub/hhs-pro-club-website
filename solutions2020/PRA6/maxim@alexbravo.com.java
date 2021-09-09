import java.util.Scanner;

public class PRA6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numOfLines = sc.nextInt();
		String[] results = new String[numOfLines];
		for(int i = 0; i < numOfLines; i ++){
			String word = sc.next();
			boolean[] contains = splitable(word);
			if(getAnswer(contains, word)){
				results[i] = "YES";
			} else {
				results[i] = "NO";
			}
		}
		for(int i = 0; i < results.length; i ++){
			System.out.println(results[i]);
		}
		
		
	}
	public static boolean getAnswer(boolean[] values, String word){
		String combined = "";
		if(values[0]){
			combined = combine(word.split("pi"));
			if(values[1]){
				combined = combine(combined.split("ka"));
				if(values[2]){
					combined = combine(combined.split("chu"));
		        }
		    }
		}
		if(combined.length() == 0){
			return true;
		} 
		return false;
	}
	public static String combine(String[] in){
		String result = "";
		for(int i = 0; i < in.length; i++){
			result += (in[i]);
		}
		return result;
	}
	public static boolean[] splitable(String word){
		boolean[] values = new boolean[3];
		if(word.split("pi") != null){
			values[0] = true;
		} else {
			values[0] = true;
		}
		
		if(word.split("ka") != null){
			values[1] = true;
		} else {
			values[1] = true;
		}
		
		if(word.split("chu") != null){
			values[2] = true;
		} else {
			values[2] = true;
		}
		return values;
	}
}
