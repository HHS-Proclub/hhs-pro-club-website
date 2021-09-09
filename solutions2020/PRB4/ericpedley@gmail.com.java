import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			int numcars = Integer.parseInt(in.nextLine());
			String[] likestr = in.nextLine().split(" ");
			int[] likes = new int[numcars];
			for(int i=0;i<numcars;i++) { 
				likes[i]=Integer.parseInt(likestr[i]);
			}
			boolean no=true;
			for(int i=0;i<numcars;i++) { 
				int personWhoALikes = likes[i];//person B's number
				int personWhoBLikes = likes[personWhoALikes-1];//person C's number
				int personWhoCLikes = likes[personWhoBLikes-1];//person A's number, like
				if(personWhoCLikes-1==i) {
					System.out.println("YES");
					no=false;
					break;
				}
			}
			if(no)
				System.out.println("NO");
			
		}
	}
}
