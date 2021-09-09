import java.util.ArrayList;
import java.util.Scanner;
public class R1B3 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i = 2; i < num; i++)
		{
			boolean isPrime = true;
			for(int j = 2; j < i; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
				}
			}
			if(isPrime)
			{
				intArray.add(i);
			}
		}
		
		int total = 0;
		for(int k = 0; k < intArray.size(); k++)
		{
			total += intArray.get(k);
		}
		System.out.println(total);
	}
}
