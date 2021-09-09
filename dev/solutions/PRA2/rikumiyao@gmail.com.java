import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;
public class PRA2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		BigInteger[]arr = new BigInteger[n];
		for(int x=1;x<n;x++){
			arr[x] = BigInteger.ZERO;
		}
		arr[0] = BigInteger.ONE;
		for(int x=0;x<n;x++){
			if(x+1<n){
				arr[x+1] = arr[x+1].add(arr[x]);
				if(x+2<n){
					arr[x+2] = arr[x+2].add(arr[x]);
				}
			}
		}
		System.out.println(arr[n-1]);
	}
}
