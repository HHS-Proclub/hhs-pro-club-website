import java.util.ArrayList;
import java.util.Scanner;

public class PRA9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] results = new int[cases];
		sc.nextLine();
		for(int i = 0; i < cases; i++){
			String line = sc.nextLine();
			String[] broken = line.split(" ");
			int[] keys = new int[broken.length];
			for(int j = 0; j < broken.length; j++){
				keys[j] = Integer.parseInt(broken[j]);
			}
			results[i] = siftThroughValues(keys);
			
		}
		
		for(int i = 0; i < results.length; i++){
			System.out.println(results[i]);
		}
	}
	
	public static int siftThroughValues(int[] inp){
		int[] in = inp;
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i = 0; i < in.length; i++){
			int note = in[i] % 7;
			if(!results.contains(note)){
				results.add(note);
			}
		}
		return results.size();
	}
	
}
