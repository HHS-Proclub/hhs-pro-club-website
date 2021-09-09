import java.util.Scanner;

public class PRB13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] raw = (in.nextLine()).split(" ");
		int[] data = new int[raw.length];
		for(int i = 0; i < raw.length; i++){
			data[i] = Integer.parseInt(raw[i]);
		}
		//all data has been parsed
		//First create all 142 possible
		int big = 0;
		while(data[0] > 0 && data[1] > 0 && data[3] > 0){
			big++;
			data[0]--;
			data[1]--;
			data[3]--;
		}
		int small = 0;
		while(data[0] > 0 && data[1] > 0){
			small++;
			data[0] --;
			data[1] --;
		}
		System.out.println(big*142 + small*12);
	}

}
