import java.util.Scanner;


public class PRB9 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		char[] test = s.toCharArray();
		int a = 1;
		
		for(int i = 0; i < test.length -1; i++) {
			for(int j = i +1; j < test.length; j++) {
				if(test[i] == test[j] && test[i] != '0'){
					a++;
					test[i] = '0';
					test[j] = '0';
				}
			}
		}
		
		System.out.println(2*s.length() - a);
	}
	
}
