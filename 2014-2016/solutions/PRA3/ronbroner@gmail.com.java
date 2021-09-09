import java.util.Arrays;
import java.util.Scanner;

public class PRA3 {
	private static Scanner k = new Scanner(System.in);
	private static int N[];
	
	public static void main (String[] args){
		int size = k.nextInt();
		N = new int[size+1];
		for (int x=1;x<=size;x++){
			int num = k.nextInt();
			N[x] = num;
		}
		int leftSide = 0, rightSide = 0;
		for (int x=1;x<=size;x++){
			for (int j=1;j<x;j++){
				leftSide = leftSide + N[j];
			}	
			for (int k=x+1;k<=size;k++){
				rightSide = rightSide + N[k];
			}
		
			if (leftSide == rightSide){
				
				System.out.println(x-1);
			}
			else {
				leftSide = 0;
				rightSide = 0;
			}
			
		}
	}
}
