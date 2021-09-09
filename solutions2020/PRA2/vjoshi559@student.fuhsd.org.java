import java.util.ArrayList;
import java.util.Scanner; 
public class PRA2 { 
	
    public static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) {
                return false; 
            }
        return true; 
    } 
  

    public static boolean isEmirp(int n) 
    { 
        int rev = 0; 
        int temp = n;
        for(;temp != 0; temp /= 10) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
        }
        /*while (n != 0) { 
            int d = n % 10; 
            rev = rev * 10 + d; 
            n /= 10; 
        }*/ 
        if (isPrime(n) == false) 
            return false; 
        else if (rev == n) {
        	return false;
        }
  

        return isPrime(rev); 
    } 
  
    public static void main(String args[]) 
    { 
    	//ArrayList<String> strList = new ArrayList<String>();
		Scanner kbd = new Scanner(System.in); 
		int numbers = kbd.nextInt();
		for (int i = 0; i < numbers; i++) {
			int a = kbd.nextInt();
			if (isEmirp(a) == true) 
				//strList.set(i, "Yes")
	            System.out.println("YES"); 
	        else
	            System.out.println("NO");
		}
		
    } 
} 