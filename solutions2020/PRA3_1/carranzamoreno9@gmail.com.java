import java.util.*;

public class PRA3_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// Number of given pieces of wood
		int k[] = new int[n];// Length of each given piece of wood
		for(int b = 0; b < n; b++) {
			k[b] = in.nextInt();
			int i = in.nextInt();// desired number of pieces of wood per given piece of wood; length of a
	        List<Integer> a = new ArrayList<Integer>();//desired length of each piece of wood

			//input loop
			for(int c = 0; c < i; c++) {
				a.add(in.nextInt()) ;
			}
			
			a.sort(null);

			int energy = 0;
			while(a.get(0)!=k[b]) {
				energy+=a.get(0)+a.get(1);
				//a.set(0, a.get(0)+a.get(1));
				a.add(a.get(0)+a.get(1));
				a.remove(0);
				a.remove(0);
				a.sort(null);
			}
			System.out.println(energy);
		}
	}
}
