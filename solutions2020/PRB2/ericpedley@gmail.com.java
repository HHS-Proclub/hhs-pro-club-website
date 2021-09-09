import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while(probs>0) {
			probs--;
			int numRooms = Integer.parseInt(in.nextLine());
			String[] rooms = in.nextLine().split(" ");
			int k=0;
			for(int i=1;i<rooms.length-1;i++) {
				if(rooms[i].equals("0")&&rooms[i-1].equals("1")&&rooms[i+1].equals("1")) {
					rooms[i+1]="0";
					k++;
				}
			}
			System.out.println(k);
		}
	}
}
