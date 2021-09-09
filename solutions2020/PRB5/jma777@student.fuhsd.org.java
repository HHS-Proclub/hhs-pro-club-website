import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB5 {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   long[] answers = new long[x];

		   StringTokenizer st;
		   for(int i = 0; i<x; i++)
		   {
			   st = new StringTokenizer(sc.nextLine());
			   int a = Integer.parseInt(st.nextToken());
			   int b = Integer.parseInt(st.nextToken());
			   answers[i]= round(a,b);
		   }
		   sc.close();
		   for(long i:answers)
		   {
			  System.out.println(i);
		   }
	}
	public static int round(int n, int numOfZeroes){
		/*
		int tenToThePower = 1;
		for(int i = 0; i<numOfZeroes; i++){
			tenToThePower *=10;
		}
		*/
		int minChar = n;
		int temp = 10;
		while(n%temp!=n && Math.log10(temp)<=numOfZeroes){
			//System.out.println(n%temp);
			temp*=10;
		}
		int tenToPower = 1;
		
		for(int i = 0; i<=numOfZeroes-Math.log10(temp); i++){
			tenToPower*=10;
		}
		
		minChar-=n%(temp/10);
		return  minChar*tenToPower;
	}
}
