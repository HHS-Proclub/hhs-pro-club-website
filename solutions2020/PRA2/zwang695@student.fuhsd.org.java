import java.util.*;
import java.lang.*;
import java.io.*;

class PRA2
{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(f.readLine());
        	int j = Integer.parseInt(st.nextToken());
        	
        	if(isEmirp(j)) System.out.println("YES");
        	else System.out.println("NO");
        }
	}
	
	public static boolean isPrime(long x){
		if(x < 2) return false;
		if(x == 2) return true;
		if((x & 1) == 0) return false;
 
		for(long i = 3; i <= Math.sqrt(x);i+=2){
			if(x % i == 0) return false;
		}
 
		return true;
	}
 
	public static boolean isEmirp(long x){
		String xString = Long.toString(x);
		if(xString.length() == 1) return false;
		if(xString.matches("[24568].*") || xString.matches(".*[24568]")) return false; //eliminate some easy rejects
		long xR = Long.parseLong(new StringBuilder(xString).reverse().toString());
		if(xR == x) return false;
		return isPrime(x) && isPrime(xR);
	}
}