

import java.util.Scanner;

public class PRB16 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int tests = Integer.parseInt(in.nextLine());
		for(int reps = 0; reps < tests; reps++){
			boolean done = false;
			String[] raw = in.nextLine().split(" ");
			int[] kids = new int[raw.length];
			for(int i = 0; i < kids.length; i++){
				kids[i] = Integer.parseInt(raw[i]);
			}
			
			int[] ages = new int[50];
			for(int i = 0; i < kids.length; i++){
				ages[kids[i]]++;
			}
			
			if(kids.length%2 == 1){
				for(int i = 0; i < kids.length; i++){
					if(ages[i] > (kids.length+1)/2){
						System.out.println("impossible");
						done = true;
						break;
					}
				}
				if(!done){
					System.out.println("possible");
				}
			}
			else{
				for(int i = 0; i < kids.length; i++){
					if(ages[i]>kids.length/2){
						System.out.println("impossible");
						done = true;
						break;
					}
				}
				if(!done){
					System.out.println("possible");
				}
			}
		}
	}
}
