import java.util.*;
public class CS3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer>set = new TreeSet<Integer>();
		set.add(n);
		boolean flag = false;
		while(true){
			int next = sumDigits(n);
			if(next==1){
				flag = true;
				break;
			}
			if(set.contains(next)){
				flag = false;
				break;
			}
			else{
				 set.add(next);
			}
			n = next;
		}
		if(flag){
			System.out.println("happy");
		}
		else{
			System.out.println("sad");
		}
	}
	public static int sumDigits(int n){
		String s = n+"";
		int sum = 0;
		for(int x=0;x<s.length();x++){
			int digit = s.charAt(x)-'0';
			sum+=digit*digit;
		}
		return sum;
	}
}
