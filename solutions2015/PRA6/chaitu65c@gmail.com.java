import java.util.Scanner;
public class PRA6 {
	public static void main(String[] args){

		Scanner h = new Scanner(System.in);
		String s = h.nextLine();
		int number = Integer.parseInt((s.substring(0, s.indexOf(" "))));
		String first = s.substring(s.indexOf(" ")+1 , s.lastIndexOf(" "));
		String second = s.substring(s.lastIndexOf(" ")+1);
		System.out.println(solve(number,first,second));
	}
	public static String solve(int h, String f, String s){
		boolean firstWin = true;
		int num = h;
		if(h == 1 || h == 2 || h==4){
			return f + " 1";
		}
		if(h==3 || h == 5){
			return s + " 2";
		}
		while(true){
			if(num > 5){
			num -= 4;
			}
			if(num == 2){
				return solve(num,f,s);
			}
			if(num <5 || num > 1){
			num -= 2;
			}
			if(num == 1){
				return firstWin+ "";
			}
			firstWin = !firstWin;
		}
		
		
	}
}
