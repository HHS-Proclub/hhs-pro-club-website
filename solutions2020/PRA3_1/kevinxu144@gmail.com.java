import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA3_1 {
	
	private static Integer energy;
	private static ArrayList<Integer[]> woodsplit = new ArrayList<Integer[]>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		String output = "";
		
		for (int i=0;i<times;i++) {
			int k = scan.nextInt();
			int ntimes = scan.nextInt();
			Integer[] wood = new Integer[ntimes];
			energy = 0;
			
			for (int j=0;j<ntimes;j++) {
				wood[j] = scan.nextInt();
			}
			
			woodsplit.clear();
			woodsplit.add(wood);
			
			while (woodsplit.size() > 0) {
				for (int j=0;j<woodsplit.size();j++) {
					Integer[] cwood = woodsplit.get(j);
					Arrays.sort(cwood);
					woodsplit.remove(j);
					
					if (cwood.length == 2) {
						energy += cwood[0]+cwood[1];
					}
					if (cwood.length == 3) {
						energy += 2*cwood[0]+2*cwood[1]+cwood[2];
					} 
					if (cwood.length > 3) {
						 if (cwood.length == 4 && cwood[cwood.length-2] != cwood[cwood.length-1]) {
							 energy += 3*cwood[0]+3*cwood[1]+2*cwood[2]+cwood[3];
						 } else {
							 split(cwood);
						 }	
					}
				}
			}
			
			output += energy + "\n";
		}
		
		System.out.println(output);
		scan.close();
	}
	
	static void split(Integer[] w) {
		int startsum = 0;
		int sum = 0;
		int stopindex = 0;
		
		for (int i=0;i<w.length;i++) {
			energy += w[i];
			sum += w[i];
		}
		
		sum /= 2;
		
		for (int i=0;i<w.length;i++) {
			if (w[i]+startsum > sum) {
				stopindex = i-1;
				break;
			}
			
			startsum += w[i];
		}
		
		Integer[] a = Arrays.copyOfRange(w, 0, stopindex+1);
		Integer[] b = Arrays.copyOfRange(w, stopindex+1, w.length);
		
		woodsplit.add(a);
		woodsplit.add(b);
	}
}
