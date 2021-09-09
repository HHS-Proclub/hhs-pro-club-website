import java.util.ArrayList;
import java.util.Scanner;

public class PRB8 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			ArrayList<ArrayList<Integer>> cubes = new ArrayList<ArrayList<Integer>>();
			
			int k = Integer.parseInt(kboard.nextLine());
			for (int j = 0; j < k; j++) {
				String line = kboard.nextLine();
				ArrayList<Integer> cube = new ArrayList<Integer>();
				String[] nums = line.split(" ");
				for(String x : nums)
					cube.add(Integer.parseInt(x));
				cubes.add(cube);
			}
			
			int goal = 1;
			
			while(true) {
				ArrayList<Integer> digits = new ArrayList<Integer>();
				int goal2 = goal;
				while(goal2 > 0) {
					digits.add(goal2 % 10);
					goal2 /= 10;
				}
				
				if (!permute(digits, cubes)) {
					break;
				} else {
					goal++;
				}
			}
			
			System.out.println(goal-1);
			
		}

	}
	
	
	public static boolean permute(ArrayList<Integer> toFind, ArrayList<ArrayList<Integer>> in) {
		if (toFind.isEmpty())
			return true;

		toFind = ((ArrayList<Integer>)toFind.clone());
		int thisOne = toFind.remove(0);
		
		for (int i = 0; i < in.size(); i++) {
			
			if (in.get(i).contains(thisOne)) {
				ArrayList<Integer> theOne = in.get(i);
				
				ArrayList<ArrayList<Integer>> cubes2 = (ArrayList<ArrayList<Integer>>)in.clone();
				cubes2.remove(i);
				
				if (permute(toFind, cubes2))
					return true;
			}
		}
		return false;
	}

}
