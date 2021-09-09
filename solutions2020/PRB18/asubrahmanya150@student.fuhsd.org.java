//package advanced;

import java.util.Scanner;

public class PRB18 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean done = false;
		int reps = Integer.parseInt(in.nextLine());
		for(int repnum = 0; repnum < reps; repnum++){
			done = false;
			String data = in.nextLine();
			for(int i = 0; i < data.length(); i++){
				for(int j = i + 1; j < data.length(); j++){
					String temp = data.substring(i, j);
					if(data.indexOf(temp) != data.lastIndexOf(temp)){
						System.out.println("not square-free");
						done = true;
						break;
					}
				}
				if(done){
					break;
				}
			}
			if(!done){
				System.out.println("square-free");
			}
		}
	}
}
