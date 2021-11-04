import java.util.Scanner;

public class PRA2 {
	
	public static int findV(int n, int k) {
		int v = 0, tmp, i = 1, nt;
		boolean flag = false;
		while (!flag) {
			nt = n;
			v++;
			while (true) {
				tmp = (int)(v / (Math.pow(k, i)));
				nt -= tmp;
				if (nt <= 0) {
					flag = true;
					break;
				}
			}
		}
		return v;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int imax = sc.nextInt();
		int[] outs = new int[imax];
		int n, k, out;
		for (int i = 0; i < imax; i++) {
			n = sc.nextInt();
			k = sc.nextInt();
			out = findV(n, k);
			outs[i] = out;
		}
		for (int i = 0; i < imax; i++) {
			System.out.println(outs[i]);
		}
	}

}
