import java.util.Scanner;
public class PRB9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i< n; i++) {
			int ith = in.nextInt();
			System.out.println(ith(ith));
		}
		in.close();
	}
	
	public static int ith(int i) {
		int it = 0;
		int c = 1;
		while(it!=i) {
			if(digitSum(c)== 10)
				it++;
			c++;
		}
		return --c;
	}
	public static int digitSum(int i) {
		char[] c= Integer.toString(i).toCharArray();
		int sum = 0;
		for(char cc : c)
			sum+=Character.getNumericValue(cc);
		return sum;
			
	}
}
