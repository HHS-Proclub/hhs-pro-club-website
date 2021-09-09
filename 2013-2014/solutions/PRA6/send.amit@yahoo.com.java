import java.util.*;


public class PRA6 {

	
	public static int floodfill(char [][] grid,int r, int c, boolean[] sides, int numR, int numC)
	{ 	
		if(r == 0 && grid[r][c] == '.')
		   sides[0] = true;
	   if(c == numC-1 && grid[r][c] == '.')
		   sides[1] = true;
	   if(r == numR-1 && grid[r][c] == '.')
		   sides[2] = true;
	   if(c == 0 && grid[r][c] == '.')
		   sides[3] = true;
		   
		boolean b = true;
		for(int i = 0;i<3;i++)
		{
		   if(sides[i] == false)
		   {
		     b = false;
		   	 break;
		   }
		}
		grid[r][c] = '#';
		// second end statement
		boolean check = true;
		int [] Int = {1,1,1,1};
		if(r != 0 && grid[r-1][c] == '.')        // North
	    {  
			Int[0] = floodfill(grid,r-1,c,sides,numR,numC); 
			check = false; 
		}
		if(c != numC-1 && grid[r][c+1] == '.')   // East
		{ 
			Int[1] = floodfill(grid,r,c+1,sides,numR,numC); 
			check = false;
			}
		if(r != numR-1 && grid[r+1][c] == '.')   //South
		{ 
			Int[2] = floodfill(grid,r+1,c,sides,numR,numC);
			check = false;
		}
		
		if( c != 0 && grid[r][c-1] == '.')       // West
		{ 	
			Int[3] = floodfill(grid,r,c-1,sides,numR,numC); 
			check = false;
		}
		// i purpposly moved this here,orriginally it was up top
		if(b == true)
			return 0;
		
		if(check == true)
			return 1;
	    
		
		boolean bool = true;
		for(int i = 0;i<Int.length;i++)
		{	
			if(Int[i] == 0)
				bool = false;
		}
		
		if(bool == false)
			return 0;
	    else
	    	return 1;
	
	
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print(" ");
		int columns = input.nextInt();
		int rows= input.nextInt();
		
		char [][] grid = new char[rows][columns];
		for(int r = 0;r<rows;r++){
			String s = input.next();
			for(int c = 0;c<columns;c++){
				grid[r][c] = s.charAt(c);
			}
		}
		int answer = 0;
		for(int r = 0;r<rows;r++) {
			for(int c = 0;c<columns;c++){  
				boolean [] bool = {false,false,false,false};
				if(grid[r][c] == '.')
				{
					answer += PRA6.floodfill(grid,r,c,bool,rows,columns);
				}
			}
		}
		System.out.println(answer);
	}
}
/* rows come first, then columns

	public static int floodfill(int [][] grid,int r, int c, boolean[] sides)
	{ 
		// first end statement
		if(r == 0 && grid[r][c] == '.')
		   sides[0] = true;
		else if( and '.'
		   sides[1] = true;
		else if(is current is lowerB and '.'
		   sides[2] = true;
		else if(is current is westB and '.'
		   sides[3] = true;
		   
		boolean b = true;
		for(i = 0;i<3;i++)
		{
		   if(sides[i] == false)
		   {
		     b = false;
		   	 break;
		   }
		}
		if(b == true)
			return 0;
		
		// second end statement
		boolean check = true;
		int [] possib = new int[4];
		if(upper exists and = '.')
			int[0] = floodfill(.......); check = false;  
		if(east exists and = '.')
			int[1] = floodfill(.......); check = false;
		if(south exists and = '.')
			int[2] = floodfill(.......); check = false;
		if(west exists and = '.')
		    int[3] = floodfill(.......); check = false;
			
		if(check = true)
			return 1;
	    
		if(anything in possib returns 0, then you return 0)
			return 0;
	    else
	    	return 1;
	    	
	    	
	    	
	    	
	//DELETE
	//	System.out.println(r+"-"+c+": " + check);
	/*	if(r==4 && c == 7){
		for(int i = 0;i<numR*numC;i++)
		{
			System.out.print(grid[i/numC][i%numC]);
			if((i+1)%numC == 0)
				System.out.println("");
		}}*/
		/*if(r == 4 && c == 7){
		for(int i = 0;i<Int.length;i++)
			System.out.println(i+": "+Int[i]);}*/
	//	System.out.print(r+"-"+c+": " );// THIS IS FOR THE NEXT FOR LOOP
	/*
	}




//DELETE THIS FOR LOOP
					for(int i = 0;i<rows*columns;i++)
					{
						System.out.print(grid[i/columns][i%columns]);
						if((i+1)%columns == 0)
							System.out.println("");
					}
					System.out.println("answer: " + answer);
					System.out.println();System.out.println();

/*for(int i = 0;i<rows*columns;i++)
		{
			System.out.print(grid[i/columns][i%columns]);
			if((i+1)%columns == 0)
				System.out.println("");
		}*/
/*
  
  
  
 
 */



