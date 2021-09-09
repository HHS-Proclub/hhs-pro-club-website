package Round1;

import java.util.ArrayList;
import java.util.Scanner;

public class R1A2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i ++){
			int size = sc.nextInt();
			System.out.println(solveOneCase(size));
		}
	}
	
	public static String solveOneCase(int size){
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < size; i++){
			A.add(sc.nextInt());
		} 
		for(int i = 0; i < size; i++){
			B.add(sc.nextInt());
		} 
		int Asum = 0;
		int Bsum = 0;
		for(int i = 0; i < size; i++){
			int largest;
			if(i%2 == 0){
				largest = A.get(getLargestIndex(A));
				Asum += largest;
				A.remove(getLargestIndex(A));
				B.remove(getLargestIndex(A));
			} else {
				largest = B.get(getLargestIndex(B));
				Bsum += largest;
				A.remove(getLargestIndex(B));
				B.remove(getLargestIndex(B));
			}
			
		}
		if(Asum > Bsum){
			return "FIRST";
		} else if(Asum == Bsum){
			return "TIE";
		} else {
			return "SECOND";
		}
	}
	public static int getLargestIndex(ArrayList<Integer> in){
		int maximumIndex = 0;
		int maximum = 0;
		for(int i = 0; i < in.size(); i++){
			if(in.get(i) > maximum){
				maximum = in.get(i);
				maximumIndex = i;
			}
		}
		return maximumIndex;
	}
}
