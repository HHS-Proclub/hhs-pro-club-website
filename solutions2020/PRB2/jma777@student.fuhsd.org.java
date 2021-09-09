import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args)
	{	
		
		Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   long[] answers = new long[x];
		   int[] rcnk;
		   int[] coords;
		   String temp;
		   ArrayList<String> temp1;
		   for(int i = 0; i<x; i++)
		   {
			   rcnk = new int[4];
			   temp = sc.nextLine();
			   temp1 = splitUpLine(temp);
			   for(int y = 0; y < 4; y++){
				   rcnk[y]=Integer.parseInt(temp1.get(y));
			   }
			   temp = sc.nextLine();
			   temp1 = splitUpLine(temp);
			   coords = new int[rcnk[2]*2];
			   for(int y = 0; y < rcnk[2]*2; y++){
				   coords[y]=Integer.parseInt(temp1.get(y));
			   }
			   //System.out.println(Arrays.toString(rcnk) + "\n" + Arrays.toString(coords));
			   answers[i]=numOfPictures(rcnk,coords);
		   }
		   sc.close();
		   for(long d:answers)
		   {
			   System.out.println(d);
		   }
		//System.out.println(4);
	 }

	private static long numOfPictures(int[] rcnk, int[] coords) {
		// TODO Auto-generated method stub
		int answer = 0;
		int[][] grid = new int[rcnk[0]][rcnk[1]];
		for(int i = 0; i < coords.length; i+=2){
			grid[coords[i]-1][coords[i+1]-1]=1;
		}
		
		int[] sumRows = new int[rcnk[0]]; 
		int[] sumColumns = new int[rcnk[1]]; 
		int sumTotal = 0;
		for(int i = 0; i < grid.length; i++){
			for(int y = 0; y < grid[0].length; y++){
				sumRows[i]+=grid[i][y];
				sumColumns[y]+=grid[i][y];
				sumTotal+=grid[i][y];
				//System.out.print(grid[i][y]);
			}
			//System.out.println();
		}
		//System.out.println(Arrays.toString(sumRows) + "\n" + Arrays.toString(sumColumns));
		for(int a: sumRows){
			if(a==rcnk[3])
				answer++;
		}
		for(int a: sumColumns){
			if(a==rcnk[3])
				answer++;
		}
		if(sumTotal==rcnk[3])
			answer++;
		int temp = 1;
		for(int i = 1; i<=rcnk[2];i++)
		{
			temp*=i;
		}
		int temp1 = 1;
		for(int i = 1; i<=rcnk[3]; i++)
		{
			temp1*=i;
		}
		temp/=temp1;
		answer+=temp;
		return answer;
	}
	
	private static ArrayList<String> splitUpLine(String line){
		ArrayList<String> answer = new ArrayList<String>();
		int temp = 0;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i)==' '){
				answer.add(line.substring(temp, i));
				temp = i+1;
			}
		}
		answer.add(line.substring(temp,line.length()));
		//System.out.println(answer.toString());
		return answer;
	}
}
