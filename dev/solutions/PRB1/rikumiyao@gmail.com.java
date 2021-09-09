import java.io.*;
import java.util.*;
public class PRB1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int n = sc.nextInt();
		int x = 0;
		for(;x*x<n;x++){
			if(x*x==n){
				break;
			}
		}
		if(x*x!=n){
			System.out.println("yo input is not a perfect square yo");
		}
		System.out.println(x*2);
	}
}
