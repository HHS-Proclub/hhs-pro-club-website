import java.util.Scanner;

public class PRA10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] input = new String[n];
		for(int i = 0;i<n;i++){
			input[i] = sc.nextLine();
		}
		for(int i = 0;i<n;i++){
		System.out.println(numOfPrimePalindrome(input[i]));
		}
	}
	public static int numOfPrimePalindrome(String s){
		String[] sep = s.split(" ");
		int[] nums = new int[2];
		for(int i = 0;i<2;i++){
			nums[i] = Integer.parseInt(sep[i]);
		}
		int ans = 0;
		for(int i = nums[0];i<=nums[1];i++){
			if(isPrime(i)&&isPalindromic(i)) ans++;
		}
		return ans;
	}
	public static boolean isPrime(int n){
		for(int i = 2;i<n;i++){
			if(n%i==0) return false;
		}
		if (n==1) return false;
		return true;
	}
	public static boolean isPalindromic(int a){
		String w = ""+a;
		w = w.trim();
		char[] word = w.toCharArray();
	    int first = 0;
	    int end = word.length - 1;
	    while (end > first) {
	        if (word[first] != word[end]) {
	            return false;
	        }
	        first++;
	        end--;
	    }
	    return true;
	}
}
