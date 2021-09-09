import java.util.ArrayList;
import java.util.Scanner;

public class PRA3 {
	public static int HarryPlotter(int[] inputs) {
		try{
		if(inputs.length < 0) {
			return 0;
		}
		
		if(inputs.length == 1) {
			return 0;
		}
		for(int i = 1; i < inputs.length-1; i++) {
			int beforeSum = 0;
			int afterSum = 0;
			for(int a = 0; a < i; a++) {
				beforeSum += inputs[a];
			}
			for(int h = i+1; h < inputs.length; h++) {
				afterSum += inputs[h];
			}
			if(beforeSum == afterSum) {
				return i;
			} 
		}
		return 0;
		}catch(NegativeArraySizeException e)
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int arr[] = new int[i];
		for(int a = 0; a < arr.length; a++) {
			Scanner scan = new Scanner(System.in);
			arr[a] = scan.nextInt();
		}
		System.out.println(HarryPlotter(arr));
	}
}
