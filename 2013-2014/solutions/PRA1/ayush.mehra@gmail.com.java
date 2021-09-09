
import java.util.*;

public class PRA1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		String line = input.nextLine();
		
		char[] chars = line.toCharArray();
		
		for(int i=0; i<chars.length; i++)
		{
			if(chars[i]!=' ')
			{
				if(chars[i]+n>'z')
				{
					chars[i]= (char)((n+chars[i]-'z')+'a'-1);
				}
				else
				{
					chars[i] += n;
				}
			}
			
			
		}
		
		for(int i=0; i<chars.length; i++)
		{
			System.out.print(chars[i]);
		}
	}
}
