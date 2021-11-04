import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		
		for(int q=0;q<numtimes;q++) 
		{
			String word=sc.next();
			
			char[] charizard=word.toCharArray();
			
			int low=0;
			int high=0;
			for(int i=0;i<charizard.length;i++) 
			{
				
					if(Character.isUpperCase(charizard[i])) 
					{
						high++;
					}else if(Character.isLowerCase(charizard[i]))
					{
						low++;
					}
				
				
			}
			if(low>=high) 
			{
				for(char charmander:charizard) 
				{
					System.out.print(Character.toLowerCase(charmander));
				}
			}else 
			{
				for(char charmander:charizard) 
				{
					System.out.print(Character.toUpperCase(charmander));
				}
			}
			
			System.out.println("");
			
			
		}
	}

}
