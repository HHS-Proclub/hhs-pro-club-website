//package R2;

import java.util.Scanner;

public class R2A1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] A = (in.nextLine()).split(" ");
		int[] a = new int[A.length];
		for (int i=0; i<A.length; i++){ 
			a[i]=Integer.parseInt(A[i]);
		}
		int root=-1*Math.abs(a[3]);
		for (int i=(-1*Math.abs(a[3])); i<Math.abs(a[3]); i++ ){
			if (( f(a[0],a[1],a[2],a[3], i) )==0){
				if (root<i){
					root = i;
				}
			}
		}
		System.out.println(root);
		
	}
	
	public static int f(int a, int b, int c, int d, int x){
		int val = (a*(x*x*x))+(b*(x*x))+(c*(x))+(d);
		return val;
	}
}
