import java.io.*;
import java.util.*; 

public class ArrayLookup {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(in.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int query = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(in.nextLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

/*		int low = 0;
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
		}*/
		
		int found=-1;
		for(int i=0;i<n&&arr[i]<=query;i++){
			if(arr[i]==query){
				found=i;
				break;
			}
		}
		System.out.println(found);
	}
}