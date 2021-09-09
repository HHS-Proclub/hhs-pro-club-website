import java.util.Scanner;

public class PRB16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());

		for(int i = 0; i < cnt; i++){
			String[] sArr = s.nextLine().split(" ");
			int[] arr = new int[sArr.length];
			for(int j = 0; j < sArr.length; j++)
				arr[j] = Integer.parseInt(sArr[j]);

			System.out.println(tmp(arr) ? "possible" : "impossible");
		}

	}
	public static boolean tmp(int[] arr){
		int n = arr.length;
		if(n == 1) return true;
		int[] nArr = new int[50];
		
		for(int k = 0; k < arr.length; k++) nArr[arr[k]]++;
		if(n % 2 == 1){
			for(int k : arr)
				if(nArr[k] > (n+1)/2) return false;
			return true;
		}
		for(int k : arr) if(nArr [k] > n/2) return false;
		return true;
	}
}