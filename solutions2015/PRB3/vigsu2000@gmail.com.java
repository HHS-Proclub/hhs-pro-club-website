import java.util.Scanner;

public class PRB3 {
	
	public static int findLargestInt(int[] arr) {
		int largestInt = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largestInt) {
				largestInt = arr[i];
			}
		}
		return largestInt;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int arr[] = new int[i];
		for(int a = 0; a < arr.length; a++) {
			arr[a] = s.nextInt();
		}
		System.out.println(findLargestInt(arr));
	}

}
