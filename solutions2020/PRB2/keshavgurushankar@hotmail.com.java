

import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int line =0;
	int total =0;
	
	for (int y = 0; y<5;y++)
	{    
		line=in.nextInt();
		total+=line;
		
		
	}
	System.out.println(total);}
}
