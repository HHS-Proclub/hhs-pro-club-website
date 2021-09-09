import java.util.Scanner;

public class PRA6 {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int reps=scan.nextInt();
		for(int i =0;i<reps;i++)
		{
			System.out.println(word(scan.nextLine()));
		}
	}
	public static String word(String a)
	{
		int n=2;
		for(int i =0;i<a.length();i+=n)
		{
			if(a.charAt(i)=='p'&&a.charAt(i+1)=='i')
			{
				
			}else if(a.charAt(i)=='k'&&a.charAt(i+1)=='a')
			{
				
			}else if(a.charAt(i)=='c'&&a.charAt(i+1)=='h'&&a.charAt(i+2)=='u'){
				n=3;
			}else
				return "NO";
		}
		return "YES";
		
	}
}
