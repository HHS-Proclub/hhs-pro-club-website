import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA7 {
	
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   int[] answers = new int[x];
		   StringTokenizer st;
		   int c, n;
		   int[] cost;
		   boolean[][] pairing;
		   boolean[] hasStuff;
		   int temp1, temp2;
		   for(int i = 0; i<x; i++)
		   {
			   st = new StringTokenizer(sc.nextLine());
			   c=Integer.parseInt(st.nextToken());
			   n=Integer.parseInt(st.nextToken());
			   cost = new int[c];
			   pairing = new boolean[c][c];
			   hasStuff= new boolean[c];
			   st = new StringTokenizer(sc.nextLine());
			   for(int y = 0; y<c; y++){
				   cost[y] = Integer.parseInt(st.nextToken());
			   }
			   for(int y = 0; y<n; y++){
				   st = new StringTokenizer(sc.nextLine());
				   temp1 = Integer.parseInt(st.nextToken())-1;
				   temp2 = Integer.parseInt(st.nextToken())-1;
				   pairing[Math.min(temp1, temp2)][Math.max(temp1, temp2)]=true;
				   hasStuff[Math.min(temp1, temp2)]=true;
				   
			   }
			   
			   for(int y = 0; y<c; y++){
				   for(int z = 0; z<c; z++){
					   if(pairing[y][z])
						   System.out.print(1);
					   else
						   System.out.print(0);
				   }
				   System.out.println();
			   }
			   
			   /*
			   for(int y = 0; y<c; y++){
				   if(hasStuff[y]){
					   System.out.println(1);
				   } else {
					   System.out.println(0);
				   }
				    
			   }
			   */
			   answers[i]=findMinGold(c,n,cost,pairing,hasStuff);
			   
		   }
		   sc.close();
		   for(int s:answers)
		   {
			  System.out.println(s);
		   }
	}

	private static int findMinGold(int c, int n, int[] cost, boolean[][] pairing, boolean[] hasStuff) {
		boolean[] marked = new boolean[c];
		int answer = 0;
		for(int i = 0; i< c; i++){
			if(!marked[i]){
				answer += findMinGoldRec(i,c,n,cost,pairing,marked,hasStuff);
				//System.out.println(answer);
			}
			/*
			for(int y = 0; y<c; y++){
				if(marked[y]){
					System.out.print(1);
				}else{
					System.out.print(0);
				}
			}
			System.out.println();
			*/
		}
		
		return answer;
	}

	private static int findMinGoldRec(int i, int c, int n, int[] cost, boolean[][] pairing, boolean[] marked, boolean[] hasStuff) {
		int min;
		marked[i]=true;
		if(!hasStuff[i]){
			return cost[i];
		} else {
			min = cost[i];
			for(int y = i; y<c; y++){
				if(pairing[i][y]){
					//System.out.print(1);
					min=Math.min(min, findMinGoldRec(y,c,n,cost,pairing,marked,hasStuff));
				} else {
					//System.out.print(0);
				}
			}
			//System.out.println();
			return min;
		}
		
	}

}
