import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String one=s.nextLine();
		String two=s.nextLine();
		System.out.println(findMin(one,two));
	}

	public static int findMin(String a ,String b)
	{	
		int first[] = new int[a.length()+1]; 
		int second[] = new int[a.length()+1];
		int one; 
		int two; 
		char each; 
		int len; 
		for (one = 0; one<=a.length(); one++) {
			first[one] = one;
		}

		for (two = 1; two<=b.length(); two++) {
			each = b.charAt(two-1);
			second[0] = two;

			for (one=1; one<=a.length(); one++) {
				if(each==a.charAt(one-1))
				{
					len=0;
				}
				else{
					len=1;
				}
				second[one] = Math.min(Math.min(second[one-1]+1, first[one]+1),  first[one-1]+len);
			}

			int placed[] = first;
			first = second;
			second = placed;
		}


		return first[a.length()];
	}
}


