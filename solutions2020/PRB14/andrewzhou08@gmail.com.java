import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB14 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.nextLine());
		
		ArrayList<Integer> output = new ArrayList<Integer>();

		for(int i = 0; i < num; i++) {
			String array = kb.nextLine();
			String[] numbersStr = array.split("\\s+");
			int[] numbers = new int[numbersStr.length];
			for(int j = 0; j < numbersStr.length; j++) {
				numbers[j] = Integer.parseInt(numbersStr[j]);
			}
			Arrays.sort(numbers);
			
			int smallest = findSmallest(numbers, numbers.length);
			
			output.add(smallest);
		}
		

		for(int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
		
		
		int out = 0;
		
		
		//System.out.println(out);
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
