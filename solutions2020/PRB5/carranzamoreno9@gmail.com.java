import java.util.Scanner;
public class PRB5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int totalCost[] = new int[n];
		for(int i =0; i< n; i++) {
			//Initialization
			int numDancers = in.nextInt();
			int costBlue = in.nextInt();
			int costRed = in.nextInt();
			totalCost[i] = 0;
			int dancers[] = new int[numDancers];
			for(int j =0; j< numDancers; j++) {
				dancers[j] = in.nextInt();
			}
			int[] left, right;
			int center;
			if(numDancers%2==0) {
				left = new int[numDancers/2];
				right = new int[numDancers/2];
				center = -1;
			}
			else {
				left = new int[numDancers/2];
				right = new int[numDancers/2];
				center = dancers[numDancers/2];
			}
			for(int j =0; j<left.length;j++) {
				left[j] = dancers[j];
			}
			for(int j = 0; j<right.length; j++) {
				right[j] = dancers[numDancers-1-j];
			}
			/*
			System.out.println("");
			for(int j : left)
				System.out.print(j);
			System.out.print(center);
			for(int j : right)
				System.out.print(j);
			System.out.println();
			*/
			//Figure out cost
			if(center == 2) {
				totalCost[i]+= Math.min(costRed, costBlue);
			}
			for(int j =0; j< left.length;j++) {
				if(left[j] == 2 && right[j] == 2)	
					totalCost[i]+= Math.min(costRed, costBlue) * 2;
				else if((left[j] == 2 && right[j] == 1) || (left[j] == 1 && right[j] == 2))
					totalCost[i]+= costRed;
				else if((left[j] == 2 && right[j] == 0) || (left[j] == 0 && right[j] == 2))
					totalCost[i]+= costBlue;
				else if((left[j] == 1 && right[j] == 0) || (left[j] == 0 && right[j] == 1)) {
					totalCost[i] = -1;
					break;
				}
				//System.out.println(totalCost[i]+":"+j);
			}
			//System.out.println();
		}
		for(int i : totalCost)
			System.out.println(i);
		in.close();
	}
}
