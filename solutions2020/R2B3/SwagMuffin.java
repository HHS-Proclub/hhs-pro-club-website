import java.util.Scanner;

public class R2B3 {
	public static void main(String args[])
	{
		Scanner kboard = new Scanner(System.in);
		int x,y,n;
		x = kboard.nextInt();
		y = kboard.nextInt();
		n = kboard.nextInt();
		int totalArea=0;
		int totalSum =0;
		for (int z=1; z<n; z++)
		{
			
			int temp=z;
			temp = (int) Math.pow(z, 2);
			totalArea = totalArea+temp;
			totalSum = totalSum +z;
		}
		totalSum = totalSum-1;
		if (totalSum<=0 || totalSum ==0)
		{
			totalSum =0;
		}
		System.out.println(totalSum);
		System.out.println(totalArea);
	}
}
