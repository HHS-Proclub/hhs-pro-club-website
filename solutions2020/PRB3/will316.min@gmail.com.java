import java.util.Scanner;

public class PRB3 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int probs = scan.nextInt();
		String[] results = new String[probs];
		for(int i = 0; i < probs; i++)
		{
			int letterNum = scan.nextInt();
			String letters = scan.next();
			int[] letter = new int[5];
			for (int j = 0; j < letterNum; j++)
			{
				char temp = letters.charAt(j);
				switch (temp)
				{
					case 'z':
						letter[0]++;
						break;
					case 'e':
						letter[1]++;
						break;
					case 'r':
						letter[2]++;
						break;
					case 'o':
						letter[3]++;
						break;
					case 'n':
						letter[4]++;
						break;
				}
			}
			
			int oneNum = 0;
			if (letter[3] > 0 && letter[4] > 0 && letter[1] > 0)
			{
				oneNum = Math.min(Math.min(letter[3], letter[4]), letter[1]);
				letter[3] -= oneNum;
				letter[4] -= oneNum;
				letter[1] -= oneNum;
			}
			
			int zeroNum = 0;
			if (letter[0] > 0 && letter[1] > 0 && letter[2] > 0 && letter[3] > 0)
				zeroNum = Math.min(Math.min(letter[0], letter[1]), Math.min(letter[2], letter[3]));
			
			String output = "";
			while(oneNum > 0 || zeroNum > 0)
			{
				if (oneNum > 0)
				{
					output += "1 ";
					oneNum--;
				}
				else
				{
					output += "0";
					if (zeroNum > 1)
						output += " ";
					zeroNum--;
				}
			}
			results[i] = output;
		}
		
		for (String e: results)
			System.out.println(e);
	}
}
