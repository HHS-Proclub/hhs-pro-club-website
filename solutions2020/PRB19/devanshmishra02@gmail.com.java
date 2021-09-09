import java.util.Scanner;
public class PRB19 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int count = 0;
			while(b>=c){
				b--;
				count++;
			}
			while(a>=b){
				a--;
				count++;
			}
			if(a<1){
				System.out.println("-1");
			} else {
				System.out.println(count);
			}
		}
	}

}
