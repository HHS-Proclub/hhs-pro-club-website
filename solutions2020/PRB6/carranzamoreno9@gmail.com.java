import java.util.Scanner;

public class PRB6 {
	private static int[][] stage;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int numPos[] = new int[n];
		for(int i =0; i<n; i++) {
			//init
			stage = new int[in.nextInt()][in.nextInt()];
			for(int j =0; j< stage.length;j++)
				for(int k =0; k<stage[0] .length;k++)
					stage[j][k] = in.nextInt();

			//numpos
			for(int j =0; j< stage.length;j++) {
				for(int k =0; k<stage[0] .length;k++) {
					//System.out.println("\n<");
					if(stage[j][k]== 0) {
						if(u(j,k)) {
							numPos[i]++;
							//System.out.print("u");
						}
						if(r(j,k)) {
							numPos[i]++;
							//System.out.print("r");
						}
						if(d(j,k)) {
							numPos[i]++;
							//System.out.print("d");
						}
						if(l(j,k)) {
							numPos[i]++;
							//System.out.print("l");
						}

					}
					//System.out.println("\n"+j+","+k+":"+numPos[i]);
					//System.out.println(">");
				}
			}

		}
		for( int i : numPos)
			System.out.println(i);
		in.close();
	}
	public static boolean u (int j , int k) {
		while(!top(j+1)) {
			if(stage[j][k] == 1)
				return true;
			j--;
		}
		return false;
	}
	public static boolean r (int j , int k) {
		while(!right(k-1)) {
			if(stage[j][k] == 1)
				return true;
			k++;
		}
		return false;

	}
	public static boolean d (int j , int k) {
		while(!bottom(j-1)) {
			if(stage[j][k] == 1)
				return true;
			j++;
		}
		return false;

	}
	public static boolean l (int j , int k) {
		while(!left(k+1)) {
			if(stage[j][k] == 1)
				return true;
			k--;
		}
		return false;

	}

	public static boolean top(int j) {
		return j == 0;
	}
	public static boolean bottom(int j) {
		return j == stage.length-1 ;
	}
	public static boolean right(int k) {
		return k == stage[0].length-1;
	}
	public static boolean left(int j) {
		return j == 0;
	}

}
