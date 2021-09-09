import java.io.*;
import java.util.*;
public class PRA1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n1 = Integer.parseInt(s1,16);
		int n2 = Integer.parseInt(s2,16);
		while(n1!=n2){
			if(n1>n2){
				n1-=n2;
			}
			else{
				n2-=n1;
			}
		}
		System.out.println(n1);
		String s = Integer.toHexString(n1);
		for(int x=0;x<4-s.length();x++){
			System.out.print(0);
		}
		System.out.println(Integer.toHexString(n1));
	}
}
