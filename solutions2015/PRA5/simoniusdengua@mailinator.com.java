import java.util.*;
public class PRA5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt(), col = s.nextInt(), l = s.nextInt();
		for(int i = 0; i < l; i++){
			int jx = s.nextInt(), jy = s.nextInt(), tx = s.nextInt(), ty = s.nextInt(), mx = s.nextInt(), my = s.nextInt();
			boolean can = false;
			int[] a = new int[]{0, 0, row, col};
			int[] b = new int[]{jx, jy, jy, jx};
			for(int j = 0; j < 3; j++)	can |= (man(a[j], b[j], jx, jy) < man(a[j], b[j], mx, my) && man(a[j], b[j], jx, jy) < man(a[j], b[j], tx, ty));

			if(can)	System.out.println(1);
			else System.out.println(0);
		}
	}
	public static int man(int x0, int y0, int x1, int y1) {
		return Math.abs(x1 - x0) + Math.abs(y1 - y0);
	}
}