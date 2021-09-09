//package advanced;

import java.util.Scanner;

public class PRB17 {
	
	public static int loadSize;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double numCrates = in.nextInt();
		loadSize = in.nextInt();
		System.out.println(trucksNeeded(numCrates));
	}
	public static int trucksNeeded(double crates){
		if(crates<=loadSize){
			return 1;
		}
		else if(crates%2 == 0){
			return (2*trucksNeeded(crates/2));
		}
		else{
			return (trucksNeeded(crates/2 - 1) + trucksNeeded(crates/2));
		}
	}

}
