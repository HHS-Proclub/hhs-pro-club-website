import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA1 {
	public static void main(String args[]){  
		   Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   
		   int n, c;
		   double[] dataN, dataC;
		   double[] answers = new double[x];
		   String temp;
		   for(int i = 0; i<x; i++)
		   {


			   temp = sc.nextLine();		
			   n = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			   c = Integer.parseInt(temp.substring(temp.indexOf(" ")+1,temp.length()));
			   dataN = new double[n];
			   dataC = new double[n];
			   
			   for(int y = 0; y<n; y++)
			   {
				   temp = sc.nextLine();
				   dataN[y] = Double.parseDouble(temp.substring(0, temp.indexOf(" ")));
				   dataC[y] = Double.parseDouble(temp.substring(temp.indexOf(" ")+1,temp.length()));
			   }
			   //System.out.println(Arrays.toString(dataN) + "\n" + Arrays.toString(dataC));
		   	   answers[i]= calculateTime(dataN, dataC, c);
		   }
		   sc.close();
		   //System.out.println(n + "\n" + c);
		   for(double d:answers)
		   {
			   System.out.println(d);
		   }
	 }

	private static double calculateTime(double[] dataN, double[] dataC, int c) {
		double[] times = new double[dataN.length];
		double[] smallToLarge;
		double answer = 0;
		for(int i = 0; i < times.length; i++){
			times[i]=(double)dataC[i]/dataN[i];
		}
		smallToLarge = times.clone();
		Arrays.sort(smallToLarge);
		smallToLarge = makeCumulDiff(smallToLarge);
		//Algorithm
		//Done in cycles
		//Subtract N*t from C, with t being the time to the first zero- least of C/N
		//Add c*t to the least of C
		//Repeat with t2=t to next zero-t1
		//After N.length() cycles recalculate time
		int z = 0;
		while(aboveZero(dataC)){
			//System.out.println(Arrays.toString(dataC));
			for(int i = 0; i < dataN.length; i++){
				dataC[i]-=dataN[i]*smallToLarge[z]+Double.MIN_VALUE;
			}
			dataC[findSmallest(dataC)]+=c*smallToLarge[z];
			answer += smallToLarge[z];
			//System.out.println(Arrays.toString(dataC) + "\n" + Arrays.toString(smallToLarge) + "\n" + Arrays.toString(dataN) + "\n");
			z++;
			if(z>smallToLarge.length-1){
				z=0;
				for(int i = 0; i < times.length; i++){
					times[i]=(double)dataC[i]/dataN[i];
				}
				smallToLarge = times.clone();
				Arrays.sort(smallToLarge);
				smallToLarge = makeCumulDiff(smallToLarge);
			}
			
		}
		z = findSmallest(dataC);
		answer += dataC[z]/dataN[z];
		return answer;
	} 
	public static boolean aboveZero(double[] data){
		for(int i = 0; i<data.length; i++){
			if(Double.compare(0,data[i])>0){
				return false;
			}
		}
		return true;
	}
	public static int findSmallest (double [] arr1){
		int index = 0;
	    double min = arr1[index];
	    for (int i=1; i<arr1.length; i++){
	        if (Double.compare(arr1[i], min)<0){
	            min = arr1[i];
	            index = i;
	        }
	    }
	    return index;
	}
	public static double[] makeCumulDiff(double[] in) {
	    double[] out = new double[in.length];
	    double total = 0;
	    for (int i = 0; i < in.length; i++) {
	    	out[i] = in[i]-total;
	        total += in[i];
	    }
	    return out;
	}
}
