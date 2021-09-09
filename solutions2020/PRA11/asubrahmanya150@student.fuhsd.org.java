import java.util.Scanner;

public class PRA11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int reps = 0; reps < 3; reps++){
			String[] raw = (in.nextLine()).split(" ");
			int winner = -1;
			int max = -1;
			int done = 1000000;
			int fin;
			for(int i = 0; i < raw.length; i++){
				int counter = 0;
				for(int k = 0; k < raw.length; k++){
					if(Integer.parseInt(raw[k]) == Integer.parseInt(raw[i])){
						counter++;
						if(counter>max){
							winner = Integer.parseInt(raw[i]);
							max = counter;
							done = k;
							fin = Integer.parseInt(raw[k]);
							
						}
						else if(counter == max){
							if(k<done){
								winner = Integer.parseInt(raw[i]);
								done = k;
								fin = Integer.parseInt(raw[k]);
							}
						}
					}
				}
			}
			System.out.println(winner);
		}

	}

}
