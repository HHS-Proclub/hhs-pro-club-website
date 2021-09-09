import java.util.Scanner;
public class PRB12 {
	public static int longestrun(int n, String str){
		int longestrun = 1;
		int count = 1;
		StringBuffer strcopy = new StringBuffer(str);
		while (strcopy.length()>1)
		{
			char curr = strcopy.charAt(0);
			char next = strcopy.charAt(1);
			strcopy.deleteCharAt(0);
			if(curr==next)
			{
				count++;
			}
			else
			{
				if(count>longestrun)
				{
					longestrun = count;
				}
				count = 1;
			}
		}
		if ((count)>longestrun)
		{
			longestrun = count;
		}
		return longestrun;
	}
	
	public static void main(String[] args)
	  {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		System.out.println(longestrun(n,str));
		scan.close();
	  }
}
//Tiffany Wu
//today I learned that if you start writing too many ifs
//for special cases you might want to come up w/ an actual plan