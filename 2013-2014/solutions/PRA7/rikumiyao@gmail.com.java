import java.awt.Point;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class PRA7 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		TreeSet<Point> fracs = new TreeSet<Point>(new Comparator<Point>(){
			public int compare(Point p1, Point p2) {
				return p1.x*p2.y-p2.x*p1.y;
			}
		});
		fracs.add(new Point(0,1));
		fracs.add(new Point(1,1));
		for(int x=2;x<=n;x++){
			for(int y=1;y<x;y++){
				if(gcd(x,y)==1){
					fracs.add(new Point(y,x));
				}
			}
		}
		while(!fracs.isEmpty()){
			Point p = fracs.pollFirst();
			System.out.println(p.x+"/"+p.y);
		}
	}
	
	public static int gcd(int x, int y){
		while(x!=y){
			int x1 = x;
			x = Math.max(x, y)-Math.min(x, y);
			y = Math.min(x1, y);
		}
		return x;
	}
}
