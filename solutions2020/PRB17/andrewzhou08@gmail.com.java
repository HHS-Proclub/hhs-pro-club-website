import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB17 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int crates = Integer.parseInt(kb.nextLine());
		int load = Integer.parseInt(kb.nextLine());
		
		
		System.out.println(load(crates, load));
	}
	
	public static int load(int crates, int load) {
		if(crates <= load) {
			return 1;
		} else {
			if(crates % 2 == 0) {
				return load(crates/2, load) + load(crates/2, load);
			} else {
				return load((crates+1)/2, load) + load((crates-1)/2, load);
			}
		}
	}
}
