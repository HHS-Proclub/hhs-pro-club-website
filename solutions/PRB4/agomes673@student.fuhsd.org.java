import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		for(int q=0;q<numtimes;q++) 
		{
			String word=sc.next();
			int up=0;
			int low=0;
			char[] charizard=word.toCharArray();
			for(int i=0;i<charizard.length;i++) 
			{
				if(Character.isUpperCase(charizard[i])) 
				{
					up++;
				}else 
				{
					low++;
				}
			}
			if(low>=up)
			{
				word=word.toLowerCase();
			}else 
			{
				word=word.toUpperCase();
			}
			System.out.println(word);
		}
	}

}
