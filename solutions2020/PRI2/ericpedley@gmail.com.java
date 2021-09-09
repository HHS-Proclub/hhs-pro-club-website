import java.util.Scanner;

public class PRI2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while(probs>0) {
			probs--;
			in.nextLine();//num digits
			String num = in.nextLine();
			String[] strnfn = in.nextLine().split(" ");
			int[] fn = new int[9];
			for(int i=0;i<9;i++) {
				fn[i]=Integer.parseInt(strnfn[i]);
			}
			boolean started = false;
			for(int i=0;i<num.length();i++) {
				int curr = Integer.parseInt(""+num.charAt(i));
				if(curr<fn[curr-1]) {
					started=true;
					num=num.substring(0,i)+fn[curr-1]+num.substring(i+1,num.length());
				} else if(started&&curr>fn[curr-1]) {
					break;
				}
				
			}
			System.out.println(num);
		}
	}

}
