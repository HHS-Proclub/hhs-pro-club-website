import java.util.Scanner;
import java.awt.Polygon;
public class PRB2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int years = in.nextInt();
		for(int i=0; i<years; i++){
			int n = in.nextInt();
			int d = in.nextInt();
			int xx[] = {0,d,n, n-d};
			int yy[] = {d,0,n-d,n};	
			Polygon rect = new Polygon(xx,yy,4);
			int crickets = in.nextInt();
			for(int j =0; j< crickets; j++){
				int x = in.nextInt();
				int y = in.nextInt();
				if(rect.contains(x,y))
					System.out.println("YES");
				else if(yy[0] - y == x-xx[0])
					System.out.println("YES");
				else if(yy[1] - y == xx[1]-x)
					System.out.println("YES");
				else if(yy[2] - y == x-xx[2])
					System.out.println("YES");
				else if(yy[3] - y == xx[3]-x)
					System.out.println("YES");
				else
					System.out.println("NO");
				}
		}
	}	
}