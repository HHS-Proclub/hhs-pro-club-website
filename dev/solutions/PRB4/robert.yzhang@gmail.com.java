import java.util.Scanner;


public class PRB4 {

		public static void main(String args[])
		{
			
			Scanner kboard = new Scanner(System.in);
			int words = kboard.nextInt();
			int x = 1;
			String temp;
			String all = "";

			while(x <= words)
			{
				temp = kboard.next();
				char letter = temp.charAt(0);
				String Letter = letter + "";
				if(Letter.equals("a") || Letter.equals("e") || Letter.equals("i") || Letter.equals("o") || Letter.equals("u"))
				{
					temp = temp + "way";
				}
				else
				{
					temp = temp.substring(1) + temp.substring(0, 1) + "ay";
				}
				
				all = all + "\n" + temp;
				x++;
			}
			
			System.out.println(all);
			
		}
}
