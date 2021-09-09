import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args){
		   Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   long[] answers = new long[x];
		   String temp;
		   for(int i = 0; i<x; i++)
		   {
			   temp = sc.nextLine();
			   answers[i]= divisibleBy3(temp);
		   }
		   sc.close();
		   for(long d:answers)
		   {
			   System.out.println(d);
		   }
		}

	private static long divisibleBy3(String temp) {
		/*
		int len = Long.toString(temp).length();
		long temp2 = temp;
		ArrayList<Long> intArr = new ArrayList<Long>();
		for(int i = 0; i<len; i++){
			intArr.add((long) 0);
		}
		//System.out.println(intArr);
		for (int index = 0; index < len; index++) {
		    intArr.set(len-1-index,temp2 % 10);
		    temp2 /= 10;
		}
		*/
	
		
		long answer = 0;
		//System.out.println(intArr);
		//System.out.println(sumOfArr(intArr));
		int len = temp.length();
		ArrayList<Integer> intArr = stringToIntArr(temp);
		//Algorithm
		//First remove enough stuff so sum is divisible by 3 while adding to the counter
		//Then remove the leading 0s while adding to the counter
		//Return the counter
		int temp1;
		
		temp1=(int)sumOfArr(intArr)%3;
		int i=0;
		while(i<intArr.size()&&sumOfArr(intArr)%3!=0){
			if(intArr.get(i)==temp1){
				intArr.remove(i);
				answer++;
				i--;
			}
			i++;
		}
		int f=2; 
		i=0;
		if(sumOfArr(intArr)%3==2){
			while(i<intArr.size()&&f>0&&sumOfArr(intArr)%3!=0){
				if(intArr.get(i)%3==1){
					intArr.remove(i);
					answer++;
					i--;
					f--;
				}
				i++;
			}
		}
		if(intArr.size()==0||sumOfArr(intArr)%3!=0){
			answer= -1;
		}else{
			while(intArr.get(0)==0){
				intArr.remove(0);
				answer++;
			}
		}
		return answer;
	}

	private static long sumOfArr(ArrayList<Integer> intArr) {
		// TODO Auto-generated method stub
		long answer = 0;
		for(int i: intArr){
			answer+=i;
		}
		return answer;
	}
	private static ArrayList<Integer> stringToIntArr(String temp) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i < temp.length(); i++){
			answer.add(temp.charAt(i)-'0');
		}
		return answer;
	}
}
