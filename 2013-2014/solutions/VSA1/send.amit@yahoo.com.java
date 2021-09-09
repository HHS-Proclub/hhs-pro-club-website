import java.util.*;

public class VSA1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numRows = input.nextInt();
		int numCols = input.nextInt();
		int magFactor = input.nextInt();
		
		char [][]smallPict = new char[numRows][numCols];
		for(int r = 0;r<numRows;r++)
		{
			String line = input.next();
			for(int c = 0;c<numCols;c++)
			{
				smallPict[r][c] = line.charAt(c);
			}
		}
		
		char [][] bigPict = new char[numRows*magFactor][numCols*magFactor];
		int mag = magFactor;//CHANGE ALL
		for(int r = 0;r<numRows;r++)
		{
			for(int c = 0;c<numCols;c++)
			{
				for(int rIn = 0;rIn<mag;rIn++)
					for(int cIn = 0;cIn<mag;cIn++)
					bigPict[r*mag+rIn][c*mag+cIn] =smallPict[r][c];
			}
		}
		
		for(int r = 0;r<bigPict.length;r++)
		{
			for(int c = 0;c<bigPict[r].length;c++)
			{
				System.out.print(bigPict[r][c]);
			}
			System.out.println("");
		}
		
	/*	for(int r = 0;r<numRows;r++)
		{
			for(int c = 0;c<numCols;c++)
			System.out.print(smalPict[r][c]);
			System.out.println("");
		}*/
		
		
		
		
	}

}

/*
5 9 2
H..H..III
H..H...I.
HHHH...I.
H..H...I.
H..H..III
 
 */
