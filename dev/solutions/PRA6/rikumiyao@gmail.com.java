import java.util.*;
public class PRA6 {
	public static void main(String[]args){
		int n = new Scanner(System.in).nextInt();
		String s = "1";
		for(int x=1;x<n;x++){
			String temp = "";
			int index = 0;
//			System.out.println(s);
			while(index<s.length()){
				char num = s.charAt(index);
				int count = 0;
				while(index<s.length()&&s.charAt(index)==num){
					index++;
					count++;
				}
//				System.out.println(count+" "+num);
				temp+=count+""+num;
			}
			char[]carr = temp.toCharArray();
			for(int y=0;y<carr.length/2;y++){
				char c = temp.charAt(y);
				carr[y] = carr[carr.length-y-1];
				carr[carr.length-y-1] = c;
			}
			s = new String(carr);
		}
		System.out.println(s);
	}
}
