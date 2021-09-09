import java.util.*;
public class CS1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String result = "";
		for(int x=0;x<Math.max(s1.length(),s2.length());x++){
			int index1 = s1.length()-x-1;
			int index2 = s2.length()-x-1;
			if(index1<0){
				result = s2.charAt(index2) + result;
			}
			else if(index2<0){
				result = s1.charAt(index1) + result;
			}
			else{
				int digit1 = s1.charAt(index1) - '0';
				int digit2 = s2.charAt(index2) - '0';
				result = ((digit1+digit2)%10) + result;
			}
		}
		System.out.println(result);
	}
}
