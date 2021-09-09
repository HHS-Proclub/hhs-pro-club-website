import java.util.Scanner;

public class PRA12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] s = new String[num];
		for(int i = 0;i<num;i++)
			s[i] = sc.nextLine();
		for(int i = 0;i<num;i++)
			System.out.println(work(s[i]));

	}
	public static String work(String s){
		String letters = "aa bb cc dd ee ff gg hh ii jj kk ll mm nn oo pp qq rr ss tt uu vv ww xx yy zz";
		String[] alphabet = letters.split(" ");
		for(int i = 0, a =0;i<100;i++,a++){
			if(a==26) a=0;
			s = s.replaceAll(alphabet[a], "");
		}
		if(s.length()!=0) return "Impossible";
		else return "Possible";
	}
}
