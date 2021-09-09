
import java.util.Scanner;
public class PRA3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i = 0; i < x; i++) {
			int n = in.nextInt();
			int[] pillows = new int[n];
			int k = in.nextInt();
			int p = in.nextInt();
			int tempK = k + 1;
			do {
				tempK -= 1;
				pillows[p] = tempK;
				
				doStuff(pillows, p, true);
				doStuff(pillows, p, false);
				
			}while(addAll(pillows) > k);
			
			System.out.println(tempK); 
		}
		in.close();
	}

	public static void doStuff(int[] pillows, int current, boolean goingUp) {
		if(goingUp) {
			if(current+1 >= pillows.length)
				return;
			pillows[current+1] = pillows[current] - 1;
			if(pillows[current+1] == 0)
				pillows[current+1] = 1;
			if(current+1 != pillows.length-1)
				doStuff(pillows, current+1, true);
		}else {
			if(current <= 0)
				return;
			pillows[current-1] = pillows[current] - 1;
			if(pillows[current-1] == 0)
				pillows[current-1] = 1;
			if(current-1 != 0)
				doStuff(pillows, current-1, false);
		}
	}
	
	public static int addAll(int[] x) {
		int y = 0;
		for(int i = 0; i < x.length; i++) {
			y += x[i];
		}
		return y;
	}
}
