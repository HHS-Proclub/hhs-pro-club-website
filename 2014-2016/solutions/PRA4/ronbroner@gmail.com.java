import java.util.Scanner;

public class PRA4 {
	static Scanner k = new Scanner(System.in);
	
	
	public static void main (String[] args){
	float size = k.nextInt();
	StringBuffer outcome = new StringBuffer();
	for (int x=97;x<=96+size;x++){
		outcome.append((char)x);
	}
	permutation("", outcome.toString());
	}
	
	private static void permutation(String prefix, String str){
        int n = str.length();
        if (n == 0) 
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
}
