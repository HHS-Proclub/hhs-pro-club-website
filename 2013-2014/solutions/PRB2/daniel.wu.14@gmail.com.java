
import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner dunksquad420 = new Scanner(System.in);
		Scanner dunksquad422 = new Scanner(System.in);//Not sure if this is actually necessary but whatever
		int dunks = dunksquad420.nextInt();
		String dunkscore = dunksquad422.nextLine();
		if(dunkscore.length() != dunks){
			System.out.println("Invalid number of dunks");
		}else{
			int dunkeyscore = 0;
			for(int i = 0; i<dunkscore.length(); i++){
				dunkeyscore += dunkscore.charAt(i);
				dunkeyscore -= 48;
			}
			System.out.println(dunkeyscore);
		}
	}

}
//Daniel Wu