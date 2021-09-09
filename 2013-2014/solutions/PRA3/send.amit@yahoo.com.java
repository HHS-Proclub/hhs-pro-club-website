import java.util.*;

// advanced one
public class PRA3 {

	//int [][] seq;  // sequence
	int posX;
	int posY;
	int [][] seq;
	
	public PRA3 (int y,int x,int s[][])
	{
    	        seq = s;
		posX = x;
		posY = y;
		//YOU NEED THIS
		seq[y][x] = 0;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	//	System.out.print("enter dim of square: ");  // OVER HERE
		System.out.print(" ");
        int dim = input.nextInt();
        ArrayList<PRA3>pos = new ArrayList<PRA3>();
        
        
	    
		int sequence [][] = new int[dim][dim];
		
		
		for(int r = 0;r<dim;r++)
		{
			String row = input.next();
			for(int c = 0;c<dim;c++)
			{
				sequence[c][r] = Integer.parseInt(row.charAt(c)+"");
			}
			
		}
		//starting point for all saves
		for(int i = 0;i<dim*dim;i++)
		{
			if(sequence[i%dim][i/dim] == 1)
			{
					pos.add(new PRA3(i/dim,i%dim,sequence)); // check
			}
		}
		boolean onlyZeros = false;
		here:
		do
		{  sequence = null;  //for debugging
			for(int i  = 0;i<pos.size();i++)
			{
				// 8 checks in all
				int [][] seq = pos.get(i).seq;
				int y = pos.get(i).posY-1;
				int x = pos.get(i).posX+2;
				if( y >= 0 && x < dim && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY-1;
				x = pos.get(i).posX-2;
				if( y >= 0 && x >= 0 && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY-2;
				x = pos.get(i).posX+1;
				if( y >= 0 && x < dim && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY+2;
				x = pos.get(i).posX+1;
				if( y < dim && x < dim && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY+1;
				x = pos.get(i).posX+2;
				if( y < dim && x < dim && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY+1;
				x = pos.get(i).posX-2;
				if( y < dim && x >= 0 && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY-2;
				x = pos.get(i).posX-1;
				if( y >= 0 && x >= 0 && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				y = pos.get(i).posY+2;
				x = pos.get(i).posX-1;
				if( y < dim && x >= 0 && seq[y][x] == 1)
				{
					pos.add(new PRA3(y,x,seq));
				}
				
				// could be Bug
				onlyZeros = true;
				for(int ip = 0;ip<dim*dim;ip++)
				{
					if(seq[ip%dim][ip/dim] == 1)
					{
							onlyZeros = false;
							break;
					}
				}
				if(onlyZeros)
					break here;
				pos.remove(i);
			}
			
		}while(pos.size()>0);
		
		if(onlyZeros)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}

/*WHAT TO CHECK
 * 
 * remember to switch elements from 0-1 after there drunk - DONE
 * // bugs could be y,x or x,y
 * 
 * 
  10001
  00000
  00010
  00000
  00000
  
 */
