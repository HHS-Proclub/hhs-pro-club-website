import java.util.Scanner;

public class PRB2
{

	
//	3
//	10
//	1 1 0 1 1 0 1 0 1 0 ==> 2
//	5
//	1 1 0 0 0 ==> 0 
//	6
//	1 0 1 1 0 1 ==> 2
	
	
	public static void main(String[] args)
	{
		int m;
		Scanner io = new Scanner(System.in);
		m = io.nextInt();
		for(int i = 0; i < m; i++)
		{
			int n = io.nextInt();
			int ans = 0;
			int[] arr = new int[100];
			for(int j = 0; j < n; j++)
			{
				arr[j] = io.nextInt();
			}
			for(int j = 1; j < n - 1; j++)
			{
				if(arr[j - 1] == 1 && arr[j] == 0 && arr[j + 1] == 1)
				{
					arr[j + 1] = 0;
					ans++;
				}
			}
			System.out.println(ans);
		}
		
//		Insomnia insomnia = new Insomnia();
//		Scanner keyboard = new Scanner(System.in);
//		int numberOfInputs = keyboard.nextInt();
		
		
//		int result1 = insomnia.timesToBeChanged("1 1 0 1 1 0 1 0 1 0");
//		int result2 = insomnia.timesToBeChanged("1 1 0 0 0");
//		int result3 = insomnia.timesToBeChanged("1 0 1 1 0 1");
//		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
	}
	
	//first input line - number of castles
	//second input line - number of rooms
	//third input line - lights on or off
	
	public int timesToBeChanged(String j)
	{
		int times = 0;
		
		String space = " ";
		String[] rooms = j.split(space);
		
//		for(int x = 0; x < rooms.length; x ++)
//		{
//			System.out.print(x + "   " + rooms[x]);
//			System.out.println("");
//		}
		
		for(int i = 1; i < rooms.length - 1; i ++)
		{
			if(rooms[i-1].equals("1"))
			{
//				System.out.println(i);
				if(rooms[i].equals("0"))
				{
//					System.out.println("yes2");
					if(rooms[i+1].equals("1"))
					{
//						System.out.println("score");
						times ++;
					}
				}
			}
		}
//		1 0 1 1 0 1
		//1 1 0 1 1 0 1 0 1 0
		
		return times;
	}
}