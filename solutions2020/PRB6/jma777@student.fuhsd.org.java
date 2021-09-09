import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		ArrayList<Integer> p;
		int n ,k;
		StringTokenizer st;
		sc = new Scanner(System.in);
		for(int i = 0; i<x; i++) {
			st = new StringTokenizer(sc.nextLine());
			//System.out.println(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			p=new ArrayList<Integer>();
			st = new StringTokenizer(sc.nextLine());
			for(int y = 0; y<n;y++) {
				p.add(Integer.parseInt(st.nextToken()));
			}
			System.out.println(playGame(n,k,p));
		}
		
	}

	private static int playGame(int n, int k, ArrayList<Integer> p) {
		ArrayList<Integer> arr= (ArrayList<Integer>) p.clone();
		int temp = 0;
		for(int i = 0; i<k; i++) {

			temp = Math.min(arr.get(1),arr.get(0));
			arr.add(temp);
			if(arr.get(1)<arr.get(0)) 
				temp = 1;
			else 
				temp = 0;
			arr.remove(temp);
		}
		return arr.get(0);
	}

	
	
}
