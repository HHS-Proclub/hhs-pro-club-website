import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int step=scan.nextInt();
		int dis=scan.nextInt();
		int counter=0;
		for(int i =0;dis>0;i++)
		{
			if(i%2==0)
			{
				dis-=step/2.0;
			}else{
				dis-=step/1.0;
			}
			counter++;
		}
		System.out.println(counter);
	}
	
}
