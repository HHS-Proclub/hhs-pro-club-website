import java.util.*;

public class PRA5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		double n = sc.nextDouble();
		int r = sc.nextInt();
		int minx = (int)(m-r);
		int maxx = (int)(m+r);
		int total = 0;
		for(int x=minx;x<=maxx;x++){
			int miny = (int)(-Math.sqrt(r*r-(x-m)*(x-m))+n);
			if(miny>0)
				total-=1;
			int maxy = (int)(Math.sqrt(r*r-(x-m)*(x-m))+n);
			total+=maxy-miny+1;
		}
		System.out.println(total);
	}
}
