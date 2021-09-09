import java.util.Scanner;


public class PRB3 {

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int count = Integer.parseInt(kboard.next());
		int cal = 0;
		for(int i = 0; i<count; i++)
		{
			int next = Integer.parseInt(kboard.next());
			if(cal<next)
				cal = next;
		}
		System.out.println(cal);
	}
}
