import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB15 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int questions = Integer.parseInt(kb.nextLine());
		int trues = Integer.parseInt(kb.nextLine());
		int falses = questions - trues;
		int actualtrues = Integer.parseInt(kb.nextLine());
		int actualfalses = questions - actualtrues;
		
		
		
		int out = 0;
		if(trues >= actualtrues) {
			out += actualtrues;
			out += falses;
		} else {
			out += trues;
			out += actualfalses;
		}
		
		System.out.println(out);
	}
	
	static int findSmallest(int arr[], int n) 
    {
        int res = 1; // Initialize result
 
        // Traverse the array and increment 'res' if arr[i] is
        // smaller than or equal to 'res'.
        for (int i = 0; i < n && arr[i] <= res; i++)
            res = res + arr[i];
 
        return res;
    }
}
