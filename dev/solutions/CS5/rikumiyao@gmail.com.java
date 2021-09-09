import java.util.*;
public class CS5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String add = "";
		String remove = "";
		for(int x=0;x<26;x++){
			char c = (char)('A'+x);
			if(s1.contains(c+"")&&!s2.contains(c+"")){
				remove+=c;
			}
			else if(!s1.contains(c+"")&&s2.contains(c+"")){
				add+=c;
			}
		}
		if(add.equals("")){
			System.out.println("none");
		}
		else{
			System.out.println(add);
		}
		if(remove.equals("")){
			System.out.println("none");
		}
		else{
			System.out.println(remove);
		}
	}
}
