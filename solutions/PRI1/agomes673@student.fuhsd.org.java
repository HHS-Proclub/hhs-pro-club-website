import java.util.Scanner;

public class PRI1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		for(int i=0;i<numtimes;i++) 
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=x+y;
			System.out.println(z);
		}
	}

}
