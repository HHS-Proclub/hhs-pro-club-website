import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < x; i++) {
            int n = in.nextInt();
            output.add(perfect(n));
        }
        for (int o : output) {
            System.out.println(o);
        }
        in.close();
	}
	public static int perfect(int n) {
		if (n == 1) {
			return 19;
		} else {
			int start = 19;
			int mod = 9;
			
			for (int i = 0; i < n-1; i++) {
				if (mod == 0 || mod == 1) {
					while (true) {
						start += 9;
						String s = String.valueOf(start);
						char[] arr = s.toCharArray();
						int sum = 0;
						for (char c : arr) {
							sum += Integer.valueOf(c + "");
						}
						if (sum == 10) {
							break;
						}
					}
				} else {
					start += 9;
					mod--;
				}
				
			}
			return start;
		}
	}
}
