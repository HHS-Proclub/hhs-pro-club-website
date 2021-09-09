import java.util.Scanner;


public class PRB13 
{
	private static int NUM_INPUT;
	private static int[] numList;
	
	public static void main (String args[])
	{
		PRB13 object = new PRB13();
		Scanner in = new Scanner(System.in);
		NUM_INPUT = in.nextInt();
		numList = object.returnMultipledMatrix(object.formMatrixOne(), object.formMatrixTwo());
		object.printString(numList);
	}
	
	private int[][] formMatrixOne()
	{
		Scanner in = new Scanner(System.in);
		int[][]matrix1 = new int[NUM_INPUT][NUM_INPUT];
		for (int i = 0; i < NUM_INPUT; i++)
		{
			for (int j = 0; j < NUM_INPUT; j++)
			{
				matrix1[i][j] = in.nextInt();
			}
		}
		return matrix1;
	}
	
	private int[][] formMatrixTwo()
	{
		Scanner in = new Scanner(System.in);
		int[][]matrix2 = new int[NUM_INPUT][NUM_INPUT];
		for (int i = 0; i < NUM_INPUT; i++)
		{
			for (int j = 0; j < NUM_INPUT; j++)
			{
				matrix2[i][j] = in.nextInt();
			}
		}
		return matrix2;
	}
	
	private int[] returnMultipledMatrix(int[][] matrix1, int[][] matrix2)
	{
		int[] newMatrix = new int[NUM_INPUT *NUM_INPUT];
		int count = 0;
		for (int i = 0; i < NUM_INPUT; i++)
		{
			for (int k = 0; k < NUM_INPUT; k++)
			{
				int sum = 0;
				for (int j = 0; j < NUM_INPUT; j++)
				{
					sum += matrix1[i][j] * matrix2[j][k];
				}
				newMatrix[count] = sum;
				count++;
			}
		}
		
		return newMatrix;
	}
	
	private void printString(int[] list)
	{
		int numInLine = 0;
		for (int i = 0; i < NUM_INPUT * NUM_INPUT; i++)
		{
			numInLine++;
			System.out.print(list[i] + " ");
			if (numInLine == NUM_INPUT)
			{
				System.out.println();
				numInLine = 0;
			}
		}
	}
}
