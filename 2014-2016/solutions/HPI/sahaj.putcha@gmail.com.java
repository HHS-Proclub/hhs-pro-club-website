import java.util.Scanner;

public class HPI {
	
	public static void main(String[] args)
	{
		try{
		Scanner scan= new Scanner(System.in);
		int times=Integer.parseInt(scan.nextLine());;
		long total=Integer.parseInt(scan.nextLine());
		int counter=0;
		String[] a= new String[times];
		while(counter<times)
		{
			 a[counter]=scan.nextLine();
			 counter++;
		}
		for(int i =0;i<times;i++)
		{
			String x=a[i];
			if(x.charAt(0)=='A')
			{
				String[] s=x.split(" ");
				int change=Integer.parseInt(s[1]);
				total+=change;
			}else if(x.charAt(0)=='D')
			{
				String[] s=x.split(" ");
				int change=Integer.parseInt(s[1]);
				total/=change;
			}else if(x.charAt(0)=='M')	
			{
				String[] s=x.split(" ");
				int change=Integer.parseInt(s[1]);
				total*=change;
			}else if(x.charAt(0)=='C')
			{
				String[] s=x.split(" ");
				int change=Integer.parseInt(s[1]);
				total=changeBase(Long.toString(total),change);
			}
			
		}
		System.out.println(total);
		}catch(Exception e)
		{
			System.out.println(0);
		}
	}
	public static long changeBase(String num, int p)
	{
		long t=0;
		for(int i=0;i<num.length();i++)
		{
			t+=Integer.parseInt(num.substring(i,i+1))*Math.pow(p, i);
		}
		return t;
	}

}
