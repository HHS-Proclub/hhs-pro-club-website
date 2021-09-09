import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		List<Integer> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(x); i++) {
			String s = in.nextLine();
			String str = in.nextLine();
			String[] sArray = s.split(" ");
			String[] strArray = str.split(" ");
			int length = Integer.parseInt(sArray[0]);
			int n = Integer.parseInt(sArray[1]);
			int[] arr = new int[n];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(strArray[j]);
			}
			outputs.add(wood(length, arr));
			//outputs.add(0);
		}
		for (int o : outputs) {
			System.out.println(o);
		}
		
		in.close();
	}
	public static int wood(int len, int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int currLen = len;
		int pieces = 0;
		Arrays.sort(array);
		int prevLen = 0;
		
		for (int i = array.length-1; i >= 0; i--) {
			prevLen = currLen;
			currLen -= array[i];
	
			if (currLen == 0) {
				return pieces;
			}
			pieces += prevLen;
		}
		return pieces;
	}
}
