//package beginner;
//package beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class PRB3_1 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i = 0;i<testcases;i++) {
			int numdigits = in.nextInt();
			ArrayList<Integer> as = new ArrayList<Integer>();
			for(int x = 0;x<numdigits;x++) {
				as.add(in.nextInt());
			}
			System.out.println(process(as));
			
		}
	}
	
	public static int process(ArrayList<Integer> arr) {
		int counter = 0;
		while(isGood(arr) != -1) {
			arr.remove(isGood(arr));
			counter++;
		}
		return counter;
	}
	
	public static int isGood(ArrayList<Integer> nums) {
		
		if(nums.size() == 0) {
			return -1;
		}else {
			boolean good = true;
			for(int d = 0;d<nums.size();d++) {
				boolean goodThisnum = false;
				for(int y = 0;y<nums.size();y++) {
					int x = nums.get(y);
					int i = nums.get(d);
					if(y != d) {
						if(Math.abs(Math.log(x+i)/Math.log(2) - (int)(Math.log(x+i)/Math.log(2)))<.0000000001){
							goodThisnum = true;
						}
					}
				}
				if(goodThisnum == false) {
					good = false;
					return d;
				}
			}
			if(good == true) {
				return -1;
			}
		}
		return -1;
	}

}
