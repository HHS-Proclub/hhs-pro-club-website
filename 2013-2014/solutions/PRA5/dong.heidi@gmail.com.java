import java.util.Scanner;


public class PRA5 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		float h = Float.parseFloat(in.split(" ")[0]);
		float k = Float.parseFloat(in.split(" ")[1]);
		float r = Float.parseFloat(in.split(" ")[2]);
		int total = 0;
		for(int x=(int)(h-r);x<=h+r;x++) {
			for(int y=(int)(k-r);y<=k+r;y++) {
				if( (Math.pow(x-h,2)+Math.pow(y-k,2)) <= (r*r) ) {
					total++;
				}
			}
		}
		System.out.println(total);
	}
	
}
