import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int one=s.nextInt();
		int two =s.nextInt();
		int dif=0;
		if(one<0)
		{
			dif=two;
		}
		else{
			dif=two-one;
		}
		System.out.println(dif/2.0);
	}
}
