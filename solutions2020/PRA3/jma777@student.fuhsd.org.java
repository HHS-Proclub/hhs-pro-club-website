import java.util.Arrays;
import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args){
	   long startTime = System.currentTimeMillis();
	   Scanner sc=new Scanner(System.in);  
	   //System.out.println("Enter x, denoting the # of the test cases");  
	   int x= Integer.parseInt(sc.nextLine()); 
	   long[] answers = new long[x];
	   long[] nkp;
	   String temp;
	   for(int i = 0; i<x; i++)
	   {
		   nkp = new long[3];
		   temp = sc.nextLine();
		   nkp[0]=Long.parseLong(temp.substring(0,temp.indexOf(' ')));
		   nkp[1]=Long.parseLong(temp.substring(temp.indexOf(' ')+1,temp.lastIndexOf(' ')));
		   nkp[2]=Long.parseLong(temp.substring(temp.lastIndexOf(' ')+1,temp.length()));
		   answers[i]=numOfMaxPillows(nkp);
	   }
	   sc.close();
	   for(long d:answers)
	   {
		   System.out.println(d);
	   }
	   //long endTime   = System.currentTimeMillis();
	   //long totalTime = endTime - startTime;
	   //System.out.println(totalTime);
	}

	private static long numOfMaxPillows(long[] nkp) {
		/*
		long[] ArrOfPillows = new long[(int)nkp[0]];
		long x = nkp[1];
		int index = (int)nkp[2]-1;
		int i = 0;
		int temp = 1;
		//takes too long -more efficient
		while(x>0){
			if(index<nkp[0]-1&&ArrOfPillows[index]==ArrOfPillows[index+1]&&index>0&&ArrOfPillows[index]==ArrOfPillows[index-1]){
				ArrOfPillows[index]+=1;
				x--;
			}
			else if(i>0){
				if(index+i<nkp[0]){
					ArrOfPillows[index+i]+=1;
					x--;
				}
				i*=-1;
			} else if(i<0){
				if(index+i>-1){
					ArrOfPillows[index+i]+=1;
					x--;
				}
				i*=-1;
				i--;
			} else{
				i = temp;
				temp++;
			}
		}
		return ArrOfPillows[index];z
		*/
		return (nkp[1]-nkp[0])/(nkp[2]) + 1;
		
	}
}
