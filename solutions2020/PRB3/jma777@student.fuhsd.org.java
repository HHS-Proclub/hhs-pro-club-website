import java.util.Arrays;
import java.util.Scanner;

public class PRB3 {
	public static void main(String args[]){  
		   Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   long[] answers = new long[x];
		   String temp;
		   for(int i = 0; i<x; i++)
		   {
			   temp = sc.nextLine();		
			   answers[i]= biggestCounter(temp.trim());
		   }
		   sc.close();
		   for(long i:answers)
		   {
			  System.out.println(i);
		   }
	 }

	private static long biggestCounter(String s) {
		// TODO Auto-generated method stub
		char[] temp = s.toCharArray();
		int[] numbers = new int[s.length()];
		for(int i = 0 ; i < temp.length; i++){
			numbers[i]=temp[i]-'0';
		}
		int[] sortedArr = numbers.clone();
		Arrays.sort(sortedArr);
		/*
		boolean changed=false; int i = s.length()-1;
		while(!changed){
			if(i-1<0){
				changed = true;
			} else if(numbers[i]>numbers[i-1]){
				
			} else if(numbers[i-1]>numbers[i]){
				
			}
		}
		*/
		
		//Algorithm- If last digit is least- replace with second least- if second least...
		//If last digit is most- replace with least- replace next digit with next most
		//If last digit is middle- replace with higher
		//If all the same- add a digit on the end
		int y=0;
		//System.out.println(Arrays.toString(numbers));
		if(sortedArr[0]==sortedArr[s.length()-1]){
			y=-1;
		}else if(numbers[s.length()-1]==sortedArr[s.length()-1]){
			do{
				numbers[s.length()-1-y]=sortedArr[0];
				y++;
			}while(sortedArr[s.length()-1-y]==sortedArr[s.length()-1]);
			for(int i = 0; i<sortedArr.length-1;i++){
				if(numbers[s.length()-1-y]==sortedArr[i] && sortedArr[i+1]!=sortedArr[i]){
					numbers[s.length()-1-y]=sortedArr[i+1];
					break;
				}
			}
		}else{
			for(int i = 0; i<sortedArr.length-1;i++){
				if(numbers[s.length()-1]==sortedArr[i] && sortedArr[i+1]!=sortedArr[i]){
					numbers[s.length()-1]=sortedArr[i+1];
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(numbers));
		StringBuilder strNum = new StringBuilder();
		for (int num : numbers) 
		{
		     strNum.append(num);
		}
		if(y==-1){
			strNum.append(sortedArr[0]);
		}
		return Long.parseLong(strNum.toString());
	}
}
