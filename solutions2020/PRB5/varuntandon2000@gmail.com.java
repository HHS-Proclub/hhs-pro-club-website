import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PRB5 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String[] arr1 = s.nextLine().split(" ");
		String[] arr2 = s.nextLine().split(" ");
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < arr1.length; i++){
			if(Integer.parseInt(arr1[i]) %10 == 0){
				A.add(Integer.parseInt(arr1[i]));
			}
		}
		for(int i = 0; i < arr2.length; i++){
			if(Integer.parseInt(arr2[i]) %10 == 0){
				B.add(Integer.parseInt(arr2[i]));
			}
		}
		Collections.sort(A);
		Collections.sort(B);
		
		System.out.println(A.get(A.size() - 1) + B.get(B.size() - 1));
		
		
		
	}
}
