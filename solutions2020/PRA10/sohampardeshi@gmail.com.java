import java.io.*;
import java.util.*;

public class PRA10 {

	public static void main(String[] Args) throws IOException{
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());

		for(int i = 0; i < cnt; i++){
			String[] arr = s.nextLine().split(" ");
			int beg = Integer.parseInt(arr[0]);
			int end = Integer.parseInt(arr[1]);
			int count = 0;
			for(int j = beg; j <= end; j++){
				if(isPrime(j) && isPalindrome(j)) count++;
			}
			System.out.println(count);			
		}

	}

	private static boolean isPrime(int num) {
		if (num < 2) return false;
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0) return false;
		return true;
	}

	public static boolean isPalindrome(int n){
		String var = n + "";
		String rev = new StringBuffer(var).reverse().toString(); 
		return var.equalsIgnoreCase(rev);
	}
}