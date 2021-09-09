import java.util.*;


public class VSA2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String possURL = input.next();
		
		if(VSA2.isURL(possURL))
			System.out.println("YES");
		else
			System.out.println("NO");	

	}
	
	public static boolean isURL(String possURL)
	{
		int indexScheme = possURL.indexOf("://");
		if(indexScheme == -1)
			return false;;
		String path = possURL.substring(indexScheme+3);	
		for(int i = 0;i<path.length();i++)
		{
			char c = path.charAt(i);
			if(!(Character.isLetter(c) || Character.isDigit(c) || (int)c==46 || (int)c==47))
				return false;
		}
		return true;
	}

}
