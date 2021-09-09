//package PR_6;

import java.util.Scanner;

public class PRA6 {
	
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		String[] out = new String[cases];
		for (int i=0; i<cases; i++){
			String word = (in.nextLine()).toLowerCase();
			out[i] =check(word);
    		
    	}
    	for (int i=0; i<cases; i++)
    	{
    		System.out.println(out[i]);
    	}
    	in.close();
	}
	
	public static String check(String str){
		String p = "pi";
		String k = "ka";
		String c = "chu";
		
		String pikachudash = (remove(str, p, k, c));
		String pikachu = pikachudash.replaceAll("-", "");
				
		if (pikachu.equals("")){
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static String remove(String str, String one, String two, String three){
		String val = ((str.replaceAll(one, "-")).replaceAll(two, "-")).replaceAll(three, "-");
		return val;
	}
	
}

