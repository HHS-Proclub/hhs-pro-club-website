//package PR_1;


import java.util.Scanner;

public class PRA1 {
    public static void main(String[] args){
    	
    	
    	Scanner in = new Scanner(System.in);
    	String line = new String();
    	Boolean[] out = new Boolean[5];
    	for (int y = 0; y<5;y++)
    	{    
    		line=in.nextLine();
    		
    		String[] argStrArr = line.split(" ");
    		int num1 = Integer.parseInt(argStrArr[0]);
    		int num2 = Integer.parseInt(argStrArr[1]);
    		int num3 = Integer.parseInt(argStrArr[2]);
    		out[y] =check(num1,num2,num3);
    		
    	}
    	for (int x = 0; x<5;x++)
    	{
    		System.out.println(out[x]);
    	}
    	in.close();
    	
    }

	private static boolean check(int one, int five, int total){
		if ((one+(five*5) >= total) && ((total % 5) <= one ) ){
			return true;
		} else {
			return false;
		}
	}
}
