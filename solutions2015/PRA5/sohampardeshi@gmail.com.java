import java.util.*;

public class PRA5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int row = s.nextInt(), col = s.nextInt();
		int l = s.nextInt();
		
		for(int i = 0; i < l; i++){
			int jx = s.nextInt();
			int jy = s.nextInt();
			int tx = s.nextInt();
			int ty = s.nextInt();
			int mx = s.nextInt();
			int my = s.nextInt();
			boolean can = false;
			
			int[] a = new int[]{0, 0, row, col};
			int[] b = new int[]{jx, jy, jy, jx};
			for(int j = 0; j < 3; j++){
				int dist  = man(a[j], b[j], jx, jy);
				int mdist = man(a[j], b[j], mx, my);
				int tdist = man(a[j], b[j], tx, ty);
				//System.out.println(dist + " " + mdist + " " + tdist);
				can |= (dist < mdist && dist < tdist);
			}
			if(can)
				System.out.println(1);
			else
				System.out.println(0);
		}
		
	}
	public static int man(int x0, int y0, int x1, int y1) {
		return Math.abs(x1 - x0) + Math.abs(y1 - y0);
	}

}