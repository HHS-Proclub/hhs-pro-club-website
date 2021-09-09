//package R1;

import java.util.Scanner;

public class R1B3 {
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	int total=0;
	for (int i=0; i<num; i++){
		if (isPrime(i)){
			total+=i;
		}
	}
	System.out.println(total);
	}
	
	
	public static boolean isPrime(int num){
		if (num < 2){
			return false;
			}
        if (num == 2){
        	return true;
        	}
        if (num % 2 == 0){
        	return false;
        	}
        for (int i = 3; i * i <= num; i += 2){
        	if (num % i == 0){
        		return false;
        	}
    	}
        return true;
    }
}
