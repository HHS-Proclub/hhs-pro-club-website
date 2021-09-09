import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PROCO2 {
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		ArrayList<Integer> temp = new ArrayList<>();
		while(in.hasNextInt()){
			temp.add(in.nextInt());
		}
		Integer[] windows = temp.toArray(new Integer[temp.size()]);
		int result = 0;
		for(int j = 0; j < k; j++){
			Arrays.sort(windows);
			result += windows[windows.length-1];
			windows[windows.length-1]--;
			
		}
		System.out.println(result);
	}
}
