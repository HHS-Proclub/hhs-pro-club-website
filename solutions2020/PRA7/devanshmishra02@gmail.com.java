import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PRA7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i = 0; i < x; i++) {
			int c = scan.nextInt();
			int n = scan.nextInt();
			int[] arr = new int[c];
			Map<Integer, Integer> objMap = new HashMap<Integer, Integer>();
			int[][] arr2 = new int[c][c];
			for(int j = 0; j < c; j++) {
				arr[j] = scan.nextInt();
			}
			for(int j = 0; j < n; j++) {
				int h = scan.nextInt();
				int u = scan.nextInt();
				objMap.put(h-1, u-1);
				
			}
			boolean keepGoing = true;
			int count = 0;
			int cost = 0;
			while(keepGoing) {
				for(int j = 0; j < c; j++) {
					if(arr[j] == count && arr[j] != -1) {
						cost += arr[j];
						arr[j] = -1;
					} else if(arr[j] == -1 && objMap.containsKey(j)) {
						arr[objMap.get(j)] = -1;
						objMap.remove(j);
					}
					if(objMap.containsKey(j)) {
						arr[objMap.get(j)] = -1;
						objMap.remove(j);
					}
				}
				count++;
				for(int j = 0; j < c; j++) {
					if(arr[j] != -1) {
						keepGoing = true;
						break;
					} else {
						keepGoing = false;
					}
					
				}
			}
			System.out.println(cost);
		}
	}
}
