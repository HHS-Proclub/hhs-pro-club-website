import java.util.Scanner;

public class HPI3 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String compress=scan.nextLine();
		String output="";
		int counter=1;
		for(int i=0;i<compress.length();i++)
		{
			char x=compress.charAt(i);
			if(i!=compress.length()-1&&compress.charAt(i+1)==x)
			{
				counter++;
			}else{
				output+=Character.toString(x)+counter;
				counter=1;
			}
		}
		System.out.println(output);
	}

}
