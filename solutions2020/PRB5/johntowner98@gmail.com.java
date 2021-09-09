import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int largestA = 0;
		int largestB = 0;
		String arrayA = scanner.nextLine();
		String[] A = arrayA.split(" ");
		for(int i = 0; i < A.length; i++)
		{
			if(A[i].charAt(A[i].length()-1) == '0')
			{
				if(Integer.parseInt(A[i]) > largestA)
				{
					largestA = Integer.parseInt(A[i]);
				}
			}
		}
		String arrayB = scanner.nextLine();
		String[] B = arrayB.split(" ");
		for(int i = 0; i < B.length; i++)
		{
			if(B[i].charAt(B[i].length()-1) == '0')
			{
				if(Integer.parseInt(B[i]) > largestB)
				{
					largestB = Integer.parseInt(B[i]);
				}
			}
		}
		System.out.println(largestA + largestB);
	}
}
