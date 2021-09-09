import java.util.*;

public class PRB4 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		int num = kboard.nextInt();
		ArrayList<String> array = new ArrayList<String>(num);
		ArrayList<String> array2 = new ArrayList<String>(num);
		
		for (int i = 0; i < num; i++)
		{
			array.add(kboard.next());
		}
		
		for (int j = 0; j < array.size(); j++)
		{
			String str = array.get(j);
			char char1 = str.charAt(0);
			boolean bool = false;
			for (int x = 0; x < consonants.length; x++)
			{
				if (char1 == consonants[x])
				{
					bool = true;
					break;
				}
			}
			if (bool == true)
			{
				str = str.substring(1, str.length()) + str.charAt(0) + "ay";
				array2.add(str);
			}
			else
			{
				str = str + "way";
				array2.add(str);
			}
		}
		
		for (int a = 0; a < array2.size(); a++)
		{
			System.out.println(array2.get(a));
		}
	}
}
