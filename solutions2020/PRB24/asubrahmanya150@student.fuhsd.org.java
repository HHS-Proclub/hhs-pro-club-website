//package advanced;

import java.util.Scanner;

public class PRB24 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		String[] parsed = new String[data.length()];
		parsed = data.split("");
		
		int out = 0;
		for(int i = 0; i < parsed.length; i++){
			if(isNumeric(parsed[i])){
				out+=Integer.parseInt(parsed[i]);
			}
		}
		System.out.println(out);
	}
	public static boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
