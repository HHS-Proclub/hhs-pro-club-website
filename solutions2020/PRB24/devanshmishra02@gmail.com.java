import java.util.Scanner;

public class PRB24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String string = s.next();
		int total = 0;
		
		for(int i = 0; i < string.length(); i++){
			if (Character.isDigit(string.charAt(i))){
				
				int x = Integer.parseInt(string.charAt(i)+"");
				total+=x;
			}
		}
		System.out.println(total);
		
	}

}
