import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) 
    {   
		Scanner scan = new Scanner( System.in );
		int wordcount = scan.nextInt();
        String output= "";
        for (int n = 0; n<wordcount; n++)
        {
            String w = scan.next();
            output += pigLatin(w);
            output += "\n";
        }
        System.out.print(output);
        scan.close();
    }
	
	public static String pigLatin(String w)
	{
		char firstchar = w.charAt(0);
		if (firstchar == 'a'||firstchar == 'e'||firstchar == 'i'
				||firstchar == 'o'||firstchar == 'u')
		{
			return w + "way";
		}
		else
		{
			return (w.substring(1)) + firstchar + "ay";
		}
	}
}
//doesn't even char anymore:
//Tiffany Wu