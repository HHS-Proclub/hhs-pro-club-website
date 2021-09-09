import java.util.*;



public class PRA7 {

	//dont have to return anything since arrayList is held by reference
	public static void denominatorMethod(int den, ArrayList<int[]> fractList)
	{
		if(den <= 0)
			return;
		numeratorMethod(den,den,fractList);
		denominatorMethod(den-1,fractList);	
	}
	
	//den is supposed to stay the same
	public static void numeratorMethod(int num,int den, ArrayList<int[]> fractList)
	{
		if(num<0)
			return; // I DONT HAVE TO RETURN ARRAYLIST BECCAUSE IT IS HELD BY REFERENCE?
		int [] fraction = new int[2];
		fraction[0] = num;
		fraction[1] = den;
		fraction = reduceFraction(fraction[0],fraction[1]);
		
		//checking if the reduced fraction is allready in fractList
		// CHANGE LOOPS FOR FASTER CODE
		boolean bool = true;
		for(int [] fractTemp:fractList)
		{
			if(fractTemp[0] == fraction[0] && fractTemp[1] == fraction[1]){
				bool = false;
				break;}
		}
		if(bool)
			fractList.add(fraction);
		
		numeratorMethod(num-1,den,fractList);
	}
	
	/** returns the reduced fraction in a int array holding 2 elements
	 [0] = num and [1] = denom     **/
	public static int[] reduceFraction(int num,int den)
	{
		if(num == 0)
			return new int[]{0,1};
		
		//DOES THE FORLOOP CONDITION CHANGE
		for(int i = 2;i<=num;i++)
		{
			if(num%i==0 && den%i==0)
			{
				num = num/i;
				den = den/i;
				i=i-1;//THIS IS INEFFIECIENT(FIXED BUT CHECK) 
			}
		}
		return new int[]{num,den};
	}
	
	public static void main(String[] args) 
	{
		//CONSOLE HAS A MAXIMUM AMOUNT OF LINES IT CAN SHOW!!!!!!
		ArrayList<int[]> fractList = new ArrayList<>(); // CAN MAKE A STATIC FIELD
		Scanner input = new Scanner(System.in);
		System.out.print(" "); // CHECK
		int denom = input.nextInt();
		denominatorMethod(denom,fractList); // I DONT HAVE TO TAKE IN THE FRACTLIST SINCE ITS HELD BY REFFERENCE
		
		
		//sort array             // POTENTIAL BUG
		for(int i = 0;i<fractList.size()-1;i++)
		{
			double num1 = fractList.get(i)[0];
			double den1 = fractList.get(i)[1];
			double num2 = fractList.get(i+1)[0];
			double den2 = fractList.get(i+1)[1];
			
			//CHECK FOR ZERO
			if(num1/den1 > num2/den2) 
			{
				//POTENTIAL BUG
				int[] array = fractList.remove(i);
				fractList.add(i+1,array);
				if(i != 0)
					i-=2;
			
			}
		}
		
		
		for(int i = 0;i<fractList.size();i++)
		{
			int num = fractList.get(i)[0];
			int den = fractList.get(i)[1];
			System.out.println(num + "/" + den);
		}
		
		
		input.close();
	}

}
