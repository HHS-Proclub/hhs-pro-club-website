import java.util.*;
public class PRB3_1 {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();

		for(int j = 0; j< n; j++) {
			int i = in.nextInt();

			ArrayList<Integer> a = new ArrayList<Integer>();

			for (int k = 0; k< i; k++)
				a.add(in.nextInt());

			boolean can;
			int remove =  0;
			for( int k =0; k<i;k++) {
				can = false;
				for(int l =0; l<i; l++) {
					if(l!=k) {
						if(two(a.get(k)+a.get(l)))
							can = true;
					}
				}
				if(!can)
					remove++;
			}
			System.out.println(remove);
		}
	}

	public static boolean two(int n) {
		while(n!=1) {
			if(n%2== 0)
				n/=2;
			else
				return false;

		}
		return true;
	}
}
