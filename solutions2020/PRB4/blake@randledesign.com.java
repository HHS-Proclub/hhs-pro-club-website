import java.util.Scanner;
import java.util.ArrayList;

public class PRB4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		for(int i = 0; i < x; i++) {
			ArrayList<Integer> miceA = new ArrayList<Integer>();
			ArrayList<Integer> miceB = new ArrayList<Integer>();
			long totalComputersUsed = 0;
			long totalCost = 0;
			int computersA = input.nextInt();
			int computersB = input.nextInt();
			int computersAB = input.nextInt();
			int numMouses = input.nextInt();
			for(int j = 0; j < numMouses; j++) {
				int cost = input.nextInt();
				int type = input.nextInt();
				if(type == 0)
					miceA.add(cost);
				else
					miceB.add(cost);
			}
			while(computersA > 0 && miceA.size() > 0) {
				int lowestCost = miceA.get(0);
				int lowestNum = 0;
				for(int j = 1; j < miceA.size(); j++) {
					if(miceA.get(j) < lowestCost) {
						lowestCost = miceA.get(j);
						lowestNum = j;
					}
				}
				totalComputersUsed++;
				totalCost += lowestCost;
				computersA--;
				miceA.remove(lowestNum);
			}
			while(computersB > 0 && miceB.size() > 0) {
				int lowestCost = miceB.get(0);
				int lowestNum = 0;
				for(int j = 1; j < miceB.size(); j++) {
					if(miceB.get(j) < lowestCost) {
						lowestCost = miceB.get(j);
						lowestNum = j;
					}
				}
				totalComputersUsed++;
				totalCost += lowestCost;
				computersB--;
				miceB.remove(lowestNum);
			}
			ArrayList<Integer> miceAB = new ArrayList<Integer>();
			miceAB.addAll(miceA);
			miceAB.addAll(miceB);
			while(computersAB > 0 && miceAB.size() > 0) {
				int lowestCost = miceAB.get(0);
				int lowestNum = 0;
				for(int j = 1; j < miceAB.size(); j++) {
					if(miceAB.get(j) < lowestCost) {
						lowestCost = miceAB.get(j);
						lowestNum = j;
					}
				}
				totalComputersUsed++;
				totalCost += lowestCost;
				computersAB--;
				miceAB.remove(lowestNum);
			}
			System.out.println(totalComputersUsed + " " + totalCost);
		}
		
		input.close();
	}

}
