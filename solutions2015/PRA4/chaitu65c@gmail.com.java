import java.util.Scanner;
public class PRA4 {
	public static void printPermutations(String prefix, String str){
        int n = str.length();
        if (n == 0) 
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                printPermutations(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
	public static void main(String[] aths){
		Scanner a = new Scanner(System.in);
		int c = a.nextInt();
		String[] alpha = new String[26];
		String[] contain = new String[c];
		int d = 65;
		for(int i = 0; i < 26;i++){
			alpha[i] = Character.toString((char)d);
			d++;
		}
		for(int f = 0; f < c; f++){
			contain[f] = alpha[f];
		}
		String g= "";
		for(int l = 0; l < contain.length; l++){
			g += contain[l];
		}
		g = g.toLowerCase();
		printPermutations("", g);
	}
}
