import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRA20 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int runs = in.nextInt();
		in.nextLine();
		
		for (int run = 0; run < runs; run++) {
			String[] unparsed = in.nextLine().split(" ");
			ArrayList<Integer> nums = new ArrayList<Integer> ();
			
			for (int i = 0; i < unparsed.length; i++) {
				nums.add(Integer.parseInt(unparsed[i]));
			}
			
//			Collections.sort(nums);
			int count = 0;
//			ArrayList<Integer> set1 = new ArrayList<Integer> (nums);
//			
//			while (set1.size() > nums.size()/2) {
//				if (add(set1) > multiply(set1)) {
//					count++;
//				}
//				
//				set1.remove(set1.size()-1);
//			}
			
//			ArrayList<Integer> set2 = new ArrayList<Integer> (nums);
//			
//			while (set2.size() > nums.size()/2+1) {
//				if (add(set2) > multiply(set2)) {
//					count++;
//				}
//				
//				set2.remove(0);
//			}
			
			System.out.println(count);
		}
	}
	
	public static int add (ArrayList<Integer> list) {
		int sum = 0;
		
		for (int n : list)
			sum += n;
		
		return sum;
	}
	
	public static int multiply (ArrayList<Integer> list) {
		int prod = 1;
		
		for (int n : list)
			prod *= n;
		
		return prod;
	}
}
