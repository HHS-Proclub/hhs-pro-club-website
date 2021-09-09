import java.util.ArrayList;
import java.util.Scanner;

public class PRB1 {
	public static void main(String args[]){  
		   Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x=sc.nextInt(); 
		   ArrayList<Integer> data  = new ArrayList<Integer>();
		   for(int i = 0; i<x; i++)
		   {
			   //System.out.println("Enter n, denoting the # of candies");  
			   data.add(sc.nextInt());
		   }
		   sc.close();
		   for(Integer i:data)
		   {
			  System.out.println(triangleNum(i));
		   }
	 } 
	public static int triangleNum(int i)
	{
		int answer = 0;
		while (((answer*(answer+1))/2)<=i)
		{
			answer++; 
		}
		return answer-1;
		
	}

}
