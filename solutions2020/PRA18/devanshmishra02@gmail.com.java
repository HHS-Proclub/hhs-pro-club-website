import java.util.Scanner;
public class PRA18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++){
			String str = s.next();
			int counta = 0;
			int countb = 0;
			boolean isBad = true;
			for(int j = 0; j < str.length(); j++){
				if(str.charAt(j) == 'a'){
					counta++;
				} else {
					countb++;
				}
			}
			if(countb == counta && str.charAt(0) == 'a' && str.charAt(str.length()-1) == 'b'){
				isBad = false;
			} else {
				isBad = true;
			}
			if(isBad){
				System.out.println("Bad");
			} else {
				System.out.println("Good");
			}
		}
	}

}
