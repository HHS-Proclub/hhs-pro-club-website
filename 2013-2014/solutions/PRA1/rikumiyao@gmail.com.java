//Programmed by YAYtears
import java.util.*;
public class PRA1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String result = new String();
		for(int x=0;x<s.length();x++){
			char c = s.charAt(x);
			if(c==' ')
				result+=(char)c;
			else{
				result+=(char)((c-'a'+n)%26+'a');
			}
		}
		System.out.println(result);
	}
}
