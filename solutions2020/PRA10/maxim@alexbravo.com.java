import java.util.Scanner;

public class PRA10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] result = new int[cases];
		for(int i = 0; i < cases; i++){
//			String line = sc.nextLine();
//			String[] sRange = line.split(" ");
			int L = sc.nextInt();
			int R = sc.nextInt();
			int count = 0;
			for(int j = L; j <= R; j++){
				if(isPrime(j) && isPalindrome(j)){
					count++;
				}
			}
			result[i] = count;
		}
		
		
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
	public static boolean isPrime(int num){
		if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}
	public static boolean isPalindrome(int num){
		String sNum = "" + num;
		for(int i = 0; i < sNum.length()/2; i++){
			if(sNum.charAt(i) != sNum.charAt(sNum.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}
