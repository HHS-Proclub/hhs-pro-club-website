import java.util.*;
public class PRB7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x=0;x<n;x++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(b-a==c-b){
				System.out.println(c+b-a);
			}
			else{
				System.out.println(c*b/a);
			}
		}
	}
}
