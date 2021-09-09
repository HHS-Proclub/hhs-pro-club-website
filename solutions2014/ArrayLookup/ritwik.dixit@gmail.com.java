import java.io.*;
import java.util.*; 

public class ArrayLookup {
	
	public static void main(String[] args) throws IOException {
		
		boolean d = false;
		
		Scanner in = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(in.nextLine());
		
        int n = Integer.parseInt(st.nextToken());
        
        int query = Integer.parseInt(st.nextToken());
              
		int[] arr = new int[n];
		
		st = new StringTokenizer(in.nextLine());
				
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == query) {
				System.out.println(j);
				d = true;
			}
		}
		
		if (!d) System.out.println("-1");
		
		/*
		int low = 0;
		int high = n;
		int found = -1;

		while (high > low) {
			int mid = (high + low) / 2;
			if (arr[mid] == query) {
				found = mid;
				break;
			} else if (arr[mid] < query) {
				low = mid;
			} else if (arr[mid] > query) {
				high = mid;
			}
		}
		System.out.println(found);x*/
		
		
	}
}
