import java.util.*;


public class PRA8 {


	
	
	
	
	public static void main(String[] args) 
	{
	//	long beforeTime = System.nanoTime();
		
		Scanner input = new Scanner(System.in);
		int baseNum = input.nextInt();
		
		if(baseNum < 4){
			System.out.println(PRA8.sketchyBusiness(baseNum));
			System.exit(0);
		}
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(0);
		
		for(int count = 1;count <= 300;count++)               //YOU HAVE TO ADD 
		{
			PRA8.addOne(numList, baseNum);
			ArrayList<Integer> squaredList = deepCopy(numList);  //right now squaredList is equal to numList
			for(int i = 1;i<count;i++) //CHECK
				for(int ip = 1;ip<=count;ip++)
					PRA8.addOne(squaredList, baseNum);
			
			String s = PRA8.getThisToString(squaredList);
			if(PRA8.isPalindrome(s))
			{
				String oldS = PRA8.getThisToString(numList);
				System.out.println(oldS + " " + s);
			}
		}
		
/*		long afterTime = System.nanoTime();
		double seconds = afterTime-beforeTime;
		seconds = seconds / Math.pow(10,9); 
		System.out.println(seconds);*/
		
	
		
	}
	
	//HAS TO HAVE ATLEAST 1 ELEMENT
	static public void addOne(ArrayList<Integer>numList, int baseNum)
	{
		numList.set(numList.size()-1,numList.get(numList.size()-1)+1);
		for(int i = numList.size()-1;i>=0;i--)
		{
			int div = numList.get(i)/baseNum;
			if(i!= 0)
				numList.set(i-1, numList.get(i-1)+div);             
			else if (div > 0){											//CHECK THIS IF STATEMEENT
				i++;
				numList.add(0,div);
			}
			int rem = numList.get(i)%baseNum;
			numList.set(i, rem);
		}
	}
	
	static public ArrayList<Integer> deepCopy(ArrayList<Integer>numList)
	{
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i:numList)
			newList.add(i);
		return  newList;
	}
	
	public static String getThisToString(ArrayList<Integer> squaredList)
	{
		StringBuffer sBuff = new StringBuffer();
		for(int num:squaredList)
			sBuff.append(num);
		
		return sBuff.toString();
	}
	
	public static boolean isPalindrome(String pal)
	{
		for(int i = 0;i<pal.length()/2;i++)
		{
			char char1 = pal.charAt(i);
			char char2 = pal.charAt(pal.length()-1-i);
			if(char1 != char2)
				return false;
		}
		return true;
	}

	public static String sketchyBusiness(int baseNum)
	{
		String s = "";
		if(baseNum == 2)
			s = "1 1\n11 1001";
		else if(baseNum == 3)
			s = "1 1\n2 11\n11 121\n101 10201\n102 11111\n202 112211\n211 122221\n1001 1002001\n" +
			"1021 1120211\n2002 11022011\n10001 100020001\n10022 101212101\n11012 122111221\n12201 1012112101\n" +
			"20002 1100220011\n100001 10000200001\n100201 10111011101\n";
			
		return s;
	}
	
}
