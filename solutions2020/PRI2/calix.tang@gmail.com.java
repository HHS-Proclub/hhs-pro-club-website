import java.util.Scanner;
public class PRI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		String[] ans = new String[times];
		for(int i = 0; i < times; i++) {
			int digits = sc.nextInt();
			String num = sc.next();
			int[] f = new int[9];
			for(int j = 0; j < 9; j++) {
				f[j] = sc.nextInt();
			}
			String newNum ="";
			int lastFirst=0;
			int firstLast=num.length()-1;
			for(int j = 0; j < num.length();j++) {
				if(Integer.parseInt(num.substring(j,j+1))<f[Integer.parseInt(num.substring(j,j+1))-1]){
					lastFirst = j;
					break;
				}
			}
			for(int j = num.length()-1;j>=0;j--) {
				if(Integer.parseInt(num.substring(j,j+1))<f[Integer.parseInt(num.substring(j,j+1))-1]){
					firstLast = j;
					break;
				}
			}
			newNum += num.substring(0,lastFirst);
			for(int j = lastFirst; j <= firstLast; j++) {
				newNum+=f[Integer.parseInt(num.substring(j,j+1))-1];
			}
			
			newNum += num.substring(firstLast+1,num.length());
			ans[i] = newNum;
		}
		
		for(int i = 0; i < times; i++) {
			System.out.println(ans[i]);
		}
		
		sc.close();
	}

}
