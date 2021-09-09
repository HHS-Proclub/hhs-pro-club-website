import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while(probs>0) {
			probs--;
			String num = in.nextLine();
			String current="";
			boolean yes=true;;
			for(int i=0;i<num.length();i++) {
				char c = num.charAt(i);
				if(c=='1') {
					current="1";
				}else if(c=='4'&&current.length()<=2&&current.length()>0) {
					current+=c;
				} else {
					yes=false;
				}
			}
			if(yes) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
