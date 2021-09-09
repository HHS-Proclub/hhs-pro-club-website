import java.util.Scanner;

public class PRB2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("Number of Castles: ");
		int probs = scan.nextInt();
		int[] results = new int[probs];
		
		for (int i = 0; i < probs; i++)
		{
			//System.out.print("Number of Rooms: ");
			int[] rooms = new int[scan.nextInt()];
			for (int j = 0; j < rooms.length; j++)
			{
				//System.out.print("Light Condition: ");
				rooms[j] = scan.nextInt();
			}
			
			int count = 0;
			for (int j = 1; j < rooms.length-1; j++)
			{
				if (rooms[j-1] == 1 && rooms[j+1] == 1 && rooms[j] == 0)
				{
					count++;
					if (j + 2 < rooms.length && rooms[j+2] == 0)
						j += 2;
				}
			}
			results[i] = count;
		}
		
		for (int i = 0; i < probs; i++)
		{
			System.out.println(results[i]);
		}
	}
}
