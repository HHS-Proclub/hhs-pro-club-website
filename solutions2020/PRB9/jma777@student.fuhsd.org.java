import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args)
	{	
		
			Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		  
		   int x = Integer.parseInt(sc.nextLine()); 
		   int[] answers = new int[x];
		   int n,k,A,B;
		   for(int i = 0; i<x; i++)
		   {
			  n = Integer.parseInt(sc.nextLine()); 
			  k = Integer.parseInt(sc.nextLine());
			  A = Integer.parseInt(sc.nextLine()); 
			  B = Integer.parseInt(sc.nextLine()); 
			  answers[i]=changeToOne(n,k,A,B);
		   }
		   sc.close();
		   for(int d:answers)
		   {
			   System.out.println(d);
		   }
		//System.out.println(4);
	 }

	private static int changeToOne(int n, int k, int a, int b) {
		int temp = n;
		int answer = 0;
		while(temp>1){
			if(temp%k==1){
				temp--;
				answer+=a;
			} else if(temp%k==0){
				temp/=k;
				answer+=b;
			} else {
				temp--;
				answer+=a;
			}
			//System.out.println(temp);
		}
		return answer;
	}
}