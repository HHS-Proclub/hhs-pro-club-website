import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int n = Integer.parseInt(s1);
		String[] line = new String[n];
		for (int i = 0;i<n;i++){
			line[i] = s.nextLine();
		}
		for (int i = 0;i<n;i++){
			System.out.println(check(line[i]));
		}
		
	}

	public static String check(String s){
		char a = 'a';
		char b = 'b';
		String sa = " "+s.charAt(0), sb = " "+s.charAt(1);
		sa = sa.trim(); sb = sb.trim();
		if(s.charAt(0)!=a){
			s = s.replaceFirst(sa, "-");
			
		}
		if(s.charAt(1)!=b){
			s = s.replaceFirst(sb, "-");
		}
		
		return s.replaceAll("-", "");
	}
}
