import java.util.ArrayList;
import java.util.Scanner;

public class PRA4 
{
	public static final String ONE = "a";
	public static final String TWO = "ab";
	public static final String THREE = "abc";
	public static final String FOUR = "abcd";
	public static final String FIVE = "abcde";
	public static final String SIX = "abcdef";
	public static final String SEVEN = "abcdefg";
	public static final String EIGHT = "abcdefgh";
	public static final String NINE = "abcdefghi";
	public static final String TEN = "abcdefghij";
	public static final String ELEVEN = "abcdefghijk";
	public static final String TWELVE = "abcdefghijkl";
	public static final String THIRTEEN = "abcdefghijklm";
	public static final String FOURTEEN = "abcdefghijklmn";
	public static final String FIFTEEN = "abcdefghijklmno";
	public static final String SIXTEEN = "abcdefghijklmnop";
	public static final String SEVENTEEN = "abcdefghijklmnopq";
	public static final String EIGHTEEN = "abcdefghijklmnopqr";
	public static final String NINETEEN = "abcdefghijklmnopqrs";
	public static final String TWENTY = "abcdefghijklmnopqrst";
	public static final String TWENTY_ONE = "abcdefghijklmnopqrstu";
	public static final String TWENTY_TWO = "abcdefghijklmnopqrstuv";
	public static final String TWENTY_THREE = "abcdefghijklmnopqrstuvw";
	public static final String TWENTY_FOUR = "abcdefghijklmnopqrstuvwx";
	public static final String TWENTY_FIVE = "abcdefghijklmnopqrstuvwxy";
	public static final String TWENTY_SIX = "abcdefghijklmnopqrstuvwxyz";
	
	private ArrayList<String> data = new ArrayList<String>();
	
		
	public void permutate(String in) 
	{
		addPermutation(in, "", 0);
	}

	private void addPermutation(String in, String prefix, int index)
	{
		if (in.length() == 0) 
			data.add(prefix);
		else if(in.length() == index)
			return;						 //This line quits the method.
		else 
		{
			addPermutation(in, prefix, index + 1);
			addPermutation(in.substring(0, index) + in.substring(index + 1),
							 prefix + in.charAt(index), 0);  	
		}
	}
	
	public static void main (String args[])
	{
		PRA4 tester = new PRA4();
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		if (num == 1)
			tester.permutate(ONE);
		else if (num == 2)
			tester.permutate(TWO);
		else if (num == 3)
			tester.permutate(THREE);
		else if (num == 4)
			tester.permutate(FOUR);
		else if (num == 5)
			tester.permutate(FIVE);
		else if (num == 6)
			tester.permutate(SIX);
		else if (num == 7)
			tester.permutate(SEVEN);
		else if (num == 8)
			tester.permutate(EIGHT);
		else if (num == 9)
			tester.permutate(NINE);
		else if (num == 10)
			tester.permutate(TEN);
		else if (num == 11)
			tester.permutate(ELEVEN);
		else if (num == 12)
			tester.permutate(TWELVE);
		else if (num == 13)
			tester.permutate(THIRTEEN);
		else if (num == 14)
			tester.permutate(FOURTEEN);
		else if (num == 15)
			tester.permutate(FIFTEEN);
		else if (num == 16)
			tester.permutate(SIXTEEN);
		else if (num == 17)
			tester.permutate(SEVENTEEN);
		else if (num == 18)
			tester.permutate(EIGHTEEN);
		else if (num == 19)
			tester.permutate(NINETEEN);
		else if (num == 20)
			tester.permutate(TWENTY);
		else if (num == 21)
			tester.permutate(TWENTY_ONE);
		else if (num == 22)
			tester.permutate(TWENTY_TWO);
		else if (num == 23)
			tester.permutate(TWENTY_THREE);
		else if (num == 24)
			tester.permutate(TWENTY_FOUR);
		else if (num == 25)
			tester.permutate(TWENTY_FIVE);
		else
			tester.permutate(TWENTY_SIX);
		
		for (int i = tester.data.size()-1; i >= 0; i--)
			System.out.println(tester.data.get(i));
	}
}
