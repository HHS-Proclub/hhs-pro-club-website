//package PR_8;

import java.util.Scanner;

public class PRA8 {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i<cases; i++){
        	int test = in.nextInt();
        	int high = high(fib(32),test); // fib is using 31 because the 31st fibonacci # is 1,346,269 and is > 1,000,000
        	int low = low(fib(32),test);
        	int changes = Math.min(Math.abs(test-low), Math.abs(high-test)); //gets the distance from high and low that is less
        	System.out.println(changes);
        }
    }
	
	public static int[] fib(int a){   // returns an array of int that form the fibonacci sequence
		int[] arr = new int[a+1];
		arr[0]=0;
		arr[1]=1;
		for (int i=2; i<a;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr;
	}
	
	public static int high(int[] set, int test){	// gets the first element in a set that is greater than test
		int[] arr = set;
		int x = 0;
		int num = arr[0];
		while (test> num){
			x++;
			num = arr[x];
		}
		return arr[x];
	}
	
	public static int low(int[] set, int test){		// gets the element in a set that is closest and lower than test (assuming set is sorted)
		int[] arr = set;
		int x = 0;
		int num = arr[0];
		while (test> num){
			x++;
			num = arr[x];
		}
		return arr[x-1];
	}
}
