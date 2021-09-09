/*
ID: rikumiya1
LANG: JAVA
TASK: palsquare
*/
import java.util.*;
import java.io.*;

public class PRA8 {
	public static void main(String[] args)throws Exception{
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for(int x=1;x<=300;x++){
			int sq = x*x;
			String s = convertBase(sq,n);
			if(isPalindrome(s)){
				System.out.println(convertBase(x,n)+" "+s);
			}
		}
	}
	
	public static String convertBase(int x, int n){
		StringBuffer sb = new StringBuffer();
		while(x!=0){
			int i = x%n;
			if(i>=10){
				sb.insert(0,(char)(i-10+'A'));
			}
			else{
				sb.insert(0,i);
			}
			x/=n;
		}
		return sb.toString();
	}
	
	public static boolean isPalindrome(String line){
		for(int x=0;x<line.length()/2;x++){
			if(line.charAt(x)!=line.charAt(line.length()-x-1))
				return false;
		}
		return true;
	}
}
