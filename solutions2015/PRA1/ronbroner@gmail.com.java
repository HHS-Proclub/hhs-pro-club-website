//Ron Broner
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {
	static Scanner kboard = new Scanner(System.in);
	private static ArrayList<Long> primes = new ArrayList<Long>();
	static int primeNum = 0;
	private static boolean isPrime = true;
	
	public static void main (String[]args){
		Long limit = kboard.nextLong();
		primeCheck(limit);
		
		Long baseTen = multiply();
		toBaseEight(baseTen);
		
	}
	
	public static ArrayList<Long> primeCheck(Long max){
		for (long x = 0; x<max;x++){
			evenCheck:
			   if (x%2==0 && x!=2 ) 
				   {isPrime = false;
				   break evenCheck;}
			    //if not, then just check the odds
			    for(int i=3;i*i<=max;i+=2) {
			    oddCheck:
			        if(x%i==0 && x!=3 &&x!=5 )
			        {isPrime = false;
			        break oddCheck;}
			    }
			    if (isPrime == true){
			    primeNum++;
			    primes.add(x);
			    }
			    isPrime = true;
		}
			return primes;
		}
	
		public static Long multiply(){
			long product = 1;
			for (int j=0;j<primes.size();j++){
				product = product * primes.get(j);
			}
			return product;
			}
		
		public static Long toBaseEight(long baseTen){
			long tRem = 0;
			long tProd = baseTen*7;
			StringBuffer solution = new StringBuffer();
			ArrayList<Long> parts = new ArrayList<Long>();
			
			while (tProd != 0){
				tRem = tProd%8;
				parts.add(tRem);
				tProd = tProd/8;
			}
			for (int e = parts.size()-1; e>=0;e--){
				solution.append(parts.get(e));
			}
			String stringAnswer = solution.toString();
			BigInteger number = new BigInteger(stringAnswer);
			System.out.println(number);
			
			return (long)0;
		}
	}

