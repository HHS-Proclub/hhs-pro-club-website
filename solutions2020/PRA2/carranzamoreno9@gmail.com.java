import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num[] = new int[n];
		for(int i =0; i< n; i++){
			num[i] = in.nextInt();
		}
		for(int i =0; i< n; i++){
			if(isEmirp(num[i]))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}

	public static boolean isEmirp(int n){
		if(n == reverse(n))
		 	return false;
	
		else if(isPrime(n)&&isPrime(reverse(n)))
			return true;
	
		return false;
	}

	public static boolean isPrime(int n){
		int factors = 0;
		for(int i =1; i<= n; i++){
			if( n%i == 0)
				factors++;
		}
		if(factors == 2)
			return true;
		return false;
	}
	
	public static int reverse(int n){

		int d = 0;

		int hold = n;



		while(hold>=1){
	
		hold/=10;

			d++;

		}



		int digits[] = new int[d];

		int l = 1;

		hold = n;


		while(n>=l){

			l*=10;

		}

		l/=10;

		for(int i =0; i< d;i++){

			digits[i] = hold/l;

			hold-= (hold/l)*l;

			l/=10;


		} 
    
	    	l = 1;

      	  	int reversed = 0;
 
       		for(int i =0; i<d; i++){
 
           	reversed+= digits[i]*l;
 
          	l*=10;

	        }
       		return reversed;

	}
}



