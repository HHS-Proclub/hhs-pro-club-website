import java.util.Arrays;
import java.util.Scanner;

public class PRA2 {
	public static void main(String args[]){  
		   Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   
		   int n;
		   int[] dataB, dataA;
		   boolean[] answers = new boolean[x];
		   String temp;
		   char[] tempArr;
		   for(int i = 0; i<x; i++)
		   {


			   temp = sc.nextLine();		
			   n = Integer.parseInt(temp);
			   dataA = new int[n];
			   dataB = new int[n];
			   
			   
			   temp = sc.nextLine();
			   tempArr = temp.toCharArray();
			   int z = 0;
			   for(int y = 0; y<2*n-1; y++){
				   if(Character.isDigit(tempArr[y])){
					   dataA[z] = tempArr[y]-'0';
					   z++;
				   }
			   }
			   temp = sc.nextLine();
			   tempArr = temp.toCharArray();
			   z = 0;
			   for(int y = 0; y<2*n-1; y++){
				   if(Character.isDigit(tempArr[y])){
					   dataB[z] = tempArr[y]-'0';
					   z++;
				   }
			   }
		   	   answers[i]= isPossible(dataA, dataB, n);
		   }
		   sc.close();
		   for(boolean d:answers)
		   {
			   if(d)
				   System.out.println("YES");
			   else
				   System.out.println("NO");
		   }
	 }

	private static boolean isPossible(int[] dataA, int[] dataB, int n) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(dataB[i]!=dataA[0]){
			i++;
		}
			//System.out.println(i);
		int[] dataC = dataB.clone();
		int[] dataD = dataB.clone();
		for(int y = 0; y<n; y++){
			if(dataB[y]==0){
				if(y-1>=0){
					dataC[y]=dataC[y-1];
					dataC[y-1]=0;
				}else{
					dataC[y]=dataC[n-1];
					dataC[n-1]=0;
				}
				dataD[y]=dataD[(y+1)%n];
				dataD[(y+1)%n]=0;
			}
		}
		
		
		
		int[][]arr1 = shuffleItems(dataB, dataA, i, n);
		int[][]arr2 = shuffleItems(dataC, dataA, i, n);
		int[][]arr3 = shuffleItems(dataD, dataA, i, n);
		
		return Arrays.equals(arr1[0], dataA)||Arrays.equals(arr1[1], dataA)||Arrays.equals(arr2[0], dataA)||Arrays.equals(arr2[1], dataA)||Arrays.equals(arr3[0], dataA)||Arrays.equals(arr3[1], dataA);
	}
	private static int[][] shuffleItems(int[] dataB, int[] dataA, int i, int n){
		int[][] answer = new int[2][n];
		int z = i;
		int x = i;
		for(int y = 0; y<n; y++){
			answer[0][y]=dataB[x];
			answer[1][y]=dataB[z];
			x++;
			z--;
			x%=n;
			if(z<0)
				z=n-1;
		}
		//fightForEquality(answer[1], dataA);
		return answer;
	}
	private static boolean fightForEquality(int[] arr1, int[] arr2){
		if(arr1.length!=arr2.length){
			return false;
		}
		for(int i = 0; i<arr1.length; i++){
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}

	
}

